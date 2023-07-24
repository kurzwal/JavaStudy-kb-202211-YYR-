// package j00_문제풀이.QXX;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.HashSet;
// import java.util.Objects;
// import java.util.StringTokenizer;

// class Dot {
//    private final int x;
//    private final int y;
//    Dot (int x, int y) {
//       this.x = x;
//       this.y = y;
//    }
//    public int getX() {return this.x;}
//    public int getY() {return this.y;}

//    @Override
//    public boolean equals(Object obj) {
//       if (this == obj)
//          return true;
//       if (obj == null || getClass() != obj.getClass())
//          return false;
//       Line other = (Line) obj;
//       return x == other.fixed && y == other.start;
//    }

//    @Override
//    public int hashCode() {
//       return Objects.hash(x, y);
//    }
// }

// class Line {
//    public final int fixed;
//    public final int start;
//    public final int end;
   
//    Line (int fixed, int start, int end) {
//       this.fixed = fixed;
//       this.start = start;
//       this.end = end;
//    }

//    public boolean isCross(int pos) {
//       if (start <= pos && pos <= end) return true;
//       return false;
//    }
//    public boolean isCrossWeak(int pos) {
//       if (start < pos && pos < end) return true;
//       return false;
//    }

//    public Line isCross(Line vtcLine) {
//       if (this.start <= vtcLine.fixed && vtcLine.fixed <= this.end
//          && vtcLine.start <= this.fixed && this.fixed <= vtcLine.end)
//          return new Line(this.fixed, vtcLine.fixed, this.end);
//       return new Line(0, 0, 0);
//    }

//    @Override
//    public boolean equals(Object obj) {
//       if (this == obj)
//          return true;
//       if (obj == null || getClass() != obj.getClass())
//          return false;
//       Line other = (Line) obj;
//       return fixed == other.fixed && start == other.start && end == other.end;
//    }

//    @Override
//    public int hashCode() {
//       return Objects.hash(fixed, start, end);
//    }
// }

// public class Q1218F {
//    public static void main(String[] args) throws IOException {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       StringBuilder sb = new StringBuilder();
//       StringTokenizer st;
//       int N = Integer.parseInt(br.readLine());
//       Dot[] dotArr = new Dot[N];
//       for (int i = 0; i < N; i++) {
//          st = new StringTokenizer(br.readLine());
//          dotArr[i] = new Dot(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
//       }
//       HashSet<Line> hrzLineSet = new HashSet<>();
//       HashSet<Line> vtcLineSet = new HashSet<>();
//       for (int current = 0; current < N; current++) {
//          int next = (current + 1) % N;
//          Dot curDot = dotArr[current];
//          Dot nextDot = dotArr[next];
//          if (curDot.getX() == nextDot.getX()) {
//             if (curDot.getY() < nextDot.getY())
//                vtcLineSet.add(new Line(curDot.getX(), curDot.getY(), nextDot.getY()));
//             else 
//                vtcLineSet.add(new Line(curDot.getX(), nextDot.getY(), curDot.getY()));
//          } else {
//             if (curDot.getX() < nextDot.getX())
//                hrzLineSet.add(new Line(curDot.getY(), curDot.getX(), nextDot.getX()));
//             else 
//                hrzLineSet.add(new Line(curDot.getY(), nextDot.getX(), curDot.getX()));
//          }
//       }
//       HashSet<Dot> dotSet = new HashSet<>(N);
//       for (Dot dot : dotArr) {
//          dotSet.add(dot);
//       }
//       for (int I = 0; I < 5; I++) {
//          st = new StringTokenizer(br.readLine());
//          int x = Integer.parseInt(st.nextToken());
//          int y = Integer.parseInt(st.nextToken());
//          String ans = isAnswer(dotSet, hrzLineSet, vtcLineSet, x, y);
//          sb.append(ans + "\n");
//       }
//       System.out.println(sb);
//    }
//    public static Line findMaxLine(
//       HashSet<Line> maxLineSet, HashSet<Line> minLineSet, 
//       int crossPos)
//    {
//       int maxPos = 1000000;
//       int minPos = 0;
//       for (Line line : maxLineSet) {
//          if (line.isCrossWeak(crossPos)) {
//             if (maxPos > line.fixed) {
//                maxPos = line.fixed;
//             }
//          }
//       }
//       for (Line line : minLineSet) {
//          if (line.isCrossWeak(crossPos)) {
//             if (minPos < line.fixed) {
//                minPos = line.fixed;
//             }
//          }
//       }
//       Line ret = new Line(crossPos, minPos, maxPos);
//       return ret;
//    }

//    public static HashSet<Dot> findRemainDots(
//       HashSet<Dot> dotSet, int fixed, 
//       Line maxLine, 
//       HashSet<Line> maxLineSet, HashSet<Line> minLineSet,
//       HashSet<Line> hrzLineSet)
//    {
//       HashSet<Dot> returnSet = new HashSet<>(dotSet);
//       for (Dot dot : dotSet) {
//          if (maxLine.isCross(dot.getX())) {
//             boolean maxOrMin = dot.getY() >= maxLine.fixed;
//             boolean check = false;
//             Line secondLine = maxOrMin ?
//                new Line(dot.getX(), maxLine.fixed, dot.getY()) :
//                new Line(dot.getX(), dot.getY(), maxLine.fixed);
//             for (Line line : maxOrMin ? maxLineSet : minLineSet) {
//                Line crossedLine = secondLine.isCross(line);
//                if (crossedLine.fixed == 0 && crossedLine.start == 0 && crossedLine.end == 0) break;
//                else check = !hrzLineSet.contains(crossedLine);
//                if (check) break;
//             }
//             if (!check) returnSet.remove(dot);
//          }
//       }
//       return returnSet;
//    }

//    public static String isAnswer(HashSet<Dot> dotSet, HashSet<Line> hrzLineSet, HashSet<Line> vtcLineSet, int x, int y) {
//       HashSet<Line> nLineSet = new HashSet<>();
//       HashSet<Line> sLineSet = new HashSet<>();
//       HashSet<Line> eLineSet = new HashSet<>();
//       HashSet<Line> wLineSet = new HashSet<>();
//       for (Line line : hrzLineSet) {
//          if (y < line.fixed) nLineSet.add(line);
//          else sLineSet.add(line);
//       }
//       for (Line line : vtcLineSet) {
//          if (x < line.fixed) eLineSet.add(line);
//          else wLineSet.add(line);
//       }

//       Line hrzMaxLine = findMaxLine(eLineSet, wLineSet, x);
//       Line vtcMaxLine = findMaxLine(nLineSet, sLineSet, y);

//       dotSet = findRemainDots(dotSet, y, hrzMaxLine, nLineSet, sLineSet, hrzLineSet);
//       System.out.println("===hrz remain dots===");
//       for (Dot dot : dotSet) {
//          System.out.println(dot.getX() + " / " + dot.getY());
//       }
//       dotSet = findRemainDots(dotSet, x, vtcMaxLine, eLineSet, wLineSet, vtcLineSet);
//       System.out.println("===vtc remain dots===");
//       for (Dot dot : dotSet) {
//          System.out.println(dot.getX() + " / " + dot.getY());
//       }
//       boolean answer = dotSet.isEmpty();
//       if (answer) return "YES";
//       return "NO";
//    }
// }