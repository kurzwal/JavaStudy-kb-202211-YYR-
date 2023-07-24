// package j00_문제풀이.QXX;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.HashSet;
// import java.util.StringTokenizer;
// import java.util.TreeMap;
// import java.util.Map.Entry;

// class Dot {
//    public final int x;
//    public final int y;
//    Dot (int x, int y) {
//       this.x = x;
//       this.y = y;
//    }
// }

// class Line {
//    public final int start;
//    public final int end;
   
//    Line (int start, int end) {
//       this.start = start;
//       this.end = end;
//    }
// }

// public class Q1218F2 {
//    public static void main(String[] args) throws IOException {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       StringBuilder sb = new StringBuilder();
//       StringTokenizer st;
//       int N = Integer.parseInt(br.readLine());
      
//       Dot[] dotArr = new Dot[N];
//       for (int i = 0; i < N; i++) {
//          st = new StringTokenizer(br.readLine());
//          int x = Integer.parseInt(st.nextToken());
//          int y = Integer.parseInt(st.nextToken());
//          dotArr[i] = new Dot(x, y);
//       }

//       // TreeMap 쓰니까 문제점
//       // 같은 key를 가진 line들이 생겨남
//       // 개망했는데요?
//       TreeMap<Integer, Line> hrzLineMap = new TreeMap<>();
//       TreeMap<Integer, Line> vtcLineMap = new TreeMap<>();
//       for (int current = 0; current < N; current++) {
//          int next = (current + 1) % N;
//          Dot curDot = dotArr[current];
//          Dot nextDot = dotArr[next];
//          if (curDot.x == nextDot.x) {
//             if (curDot.y < nextDot.y)
//                vtcLineMap.put(curDot.x, new Line(curDot.y, nextDot.y));
//             else
//                vtcLineMap.put(curDot.x, new Line(nextDot.y, curDot.y));
//          } else {
//             if (curDot.x < nextDot.x)
//                hrzLineMap.put(curDot.y, new Line(curDot.x, nextDot.x));
//             else 
//                hrzLineMap.put(curDot.y, new Line(nextDot.x, curDot.x));
//          }
//       }
      
//       for (int I = 0; I < 5; I++) {
//          st = new StringTokenizer(br.readLine());
//          int x = Integer.parseInt(st.nextToken());
//          int y = Integer.parseInt(st.nextToken());
//          String ans = isAnswer(dotArr, hrzLineMap, vtcLineMap, x, y);
//          sb.append(ans + "\n");
//       }
//       System.out.println(sb);
//    }

//    public static int findValue(TreeMap<Integer, Line> lineMap, int pos, int hrzPos, boolean isCeiling) {
//       int direction = 0;
//       while (true) {
//          Entry<Integer, Line> checkEntry = isCeiling ? lineMap.ceilingEntry(pos) : lineMap.floorEntry(pos);
//          // 벽면에 닿으면 바로 return
//          System.out.println("111111111111111111111111111111111");
//          if (direction == 0 && checkEntry.getValue().start < hrzPos && hrzPos < checkEntry.getValue().end) {
//             return checkEntry.getKey();
//          // start와 겹치면 방향 저장
//          } else if (checkEntry.getValue().start == hrzPos) {
//             if (direction == 0) {
//                direction = 1;
//             } else if (direction == 1) {
//                direction = 0;
//             } else if (direction == 2) {
//                return checkEntry.getKey();
//             }
//          // end와 겹치면 방향 저장
//          } else if(hrzPos == checkEntry.getValue().end) {
//             if (direction == 0) {
//                direction = 2;
//             } else if (direction == 1) {
//                return checkEntry.getKey();
//             } else if (direction == 2) {
//                direction = 0;
//             }
//          }
//          // return되지 않으면 다음 entry key 찾기
//          pos = isCeiling ? (checkEntry.getKey() + 1) : (checkEntry.getKey() - 1);
//       }
//    }
//    public static boolean checkGo(TreeMap<Integer, Line> lineMap, int pos, int hrzPos, boolean isCeiling, int defaultDirection, int goTo) {
//       int direction = defaultDirection;
//       while (true) {
//          Entry<Integer, Line> checkEntry = isCeiling ? lineMap.ceilingEntry(pos) : lineMap.floorEntry(pos);
//          if (direction == 0 && checkEntry.getValue().start < hrzPos && hrzPos < checkEntry.getValue().end) {
//             break;
//          } else if (checkEntry.getValue().start == hrzPos) {
//             if (direction == 0) {
//                direction = 1;
//             } else if (direction == 1) {
//                direction = 0;
//             } else if (direction == 2) {
//                direction = 3;
//             }
//          } else if(hrzPos == checkEntry.getValue().end) {
//             if (direction == 0) {
//                direction = 2;
//             } else if (direction == 1) {
//                direction = 3;
//             } else if (direction == 2) {
//                direction = 0;
//             }
//          }
//          if (isCeiling == true && checkEntry.getKey() >= goTo) return true;
//          if (isCeiling == false && checkEntry.getKey() <= goTo) return true;
//          if (direction == 3) break;
//          pos = isCeiling ? (checkEntry.getKey() + 1) : (checkEntry.getKey() - 1);
//       }
//       return false;
//    }

//    public static Line findMaxLine(TreeMap<Integer, Line> lineMap, int vtcPos, int hrzPos) {
//       int lineMaxValue = findValue(lineMap, vtcPos, hrzPos, true);
//       System.out.println("222222222222222222");
//       int lineMinValue = findValue(lineMap, vtcPos, hrzPos, false);
//       System.out.println("333333333333333333");
//       return new Line(lineMinValue, lineMaxValue);
//    }

//    public static boolean canGoFromMaxLine(Line maxLine, int dotHrz, int dotVtc, TreeMap<Integer, Line> lineMap, int hrzPos, int vtcPos) {
//       // 맨 처음으로 maxLine과 겹치면 바로 true
//       if (vtcPos == dotVtc && maxLine.start <= dotHrz && dotHrz <= maxLine.end)
//          return true;
//       // 일단 maxLine 범위 밖이면 false
//       if (maxLine.start > dotHrz || maxLine.end < dotHrz)
//          return false;
//       // maxLine과 겹치면 defaultDirection 설정
//       int direction = 0;
//       if (maxLine.start == dotHrz) // start인 경우, 다음 line의 start값이랑 겹치면 return;
//          direction = 2;
//       else if (maxLine.end == dotHrz)
//          direction = 1;
//       // isCeiling도 측정해줘야함
//       // origin보다 큰값에 있으면 ceiling : true
//       boolean isCeiling = dotVtc > vtcPos;
//       // 이제 checkGo 쓰면 됨
//       return checkGo(lineMap, vtcPos, hrzPos, isCeiling, direction, dotVtc);
//    }


//    public static String isAnswer(Dot[] dotArr, TreeMap<Integer, Line> hrzLineMap, TreeMap<Integer, Line> vtcLineMap, int x, int y) {
//       Line hrzMaxLine = findMaxLine(vtcLineMap, y, x);
//       Line vtcMaxLine = findMaxLine(hrzLineMap, x, y);
//       HashSet<Dot> answerSet = new HashSet<>(dotArr.length);
//       boolean retCheck = true;
//       for (Dot dot : dotArr) {
//          // dot hrz 검사해서 통과하면 아무것도안함
//          boolean check = canGoFromMaxLine(hrzMaxLine, dot.x, dot.y, hrzLineMap, x, y);
//          // 통과못하면 answerSet에 넣음
//          if (!check) answerSet.add(dot);
//       }
//       for (Dot dot : answerSet) {
//          // dot vtc 검사해서 통과하면 아무것도안함
//          retCheck = canGoFromMaxLine(vtcMaxLine, dot.y, dot.x, vtcLineMap, y, x);
//          // 통과못하면 바로 fail
//          if (!retCheck) break;
//       }
//       return retCheck ? "YES" : "NO";
//    }
// }