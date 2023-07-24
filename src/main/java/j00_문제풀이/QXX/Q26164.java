// package j00_문제풀이.QXX;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Objects;
// import java.util.StringTokenizer;

// class Seaweed {
//    public int x;
//    public int y;
//    Seaweed (int x, int y) {
//       this.x = x;
//       this.y = y;
//    }
//    @Override
//    public boolean equals(Object obj) {
//       if (this == obj)
//          return true;
//       if (obj == null || getClass() != obj.getClass())
//          return false;
//       Seaweed other = (Seaweed) obj;
//       return x == other.x && y == other.y;
//    }

//    @Override
//    public int hashCode() {
//       return Objects.hash(x, y);
//    }
// }

// public class Q26164 {
//    public static void main(String[] args) throws IOException {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       StringBuilder sb = new StringBuilder();
//       StringTokenizer st;
//       int N = Integer.parseInt(br.readLine());
//       ArrayList<Seaweed> swList = new ArrayList<>(N/2);
//       st = new StringTokenizer(br.readLine());
//       for (int i = 1; i <= N; i++) {
//          int start = i * 2;
//          int end = Integer.parseInt(st.nextToken());
//          if (start < end) {
//             swList.add(new Seaweed(start, end));
//          }
//       }
//       HashMap<int[], Seaweed> swComSet = new HashMap<>(); 
//       for (int i = 1; i < N; i++) {
//          int ans = seaweedSoup(swList, swComSet, i);
//          sb.append(ans).append(' ');
//       }
//       System.out.println(sb);
//    }
//    public static int seaweedSoup(ArrayList<Seaweed> swList, HashSet<Seaweed[]> swComSet, int i) {
      
//    }
//    public static boolean sw() {

//    }
//    public static boolean crossSw(Seaweed sw, int x) {
//       if (sw.x < x && x < sw.y) return true;
//       return false;
//    }
//    public static boolean crossSw(Seaweed sw1, Seaweed sw2) {
//       if (sw1.x < sw2.x && sw2.x < sw1.y && sw1.y < sw2.y) return true;
//       if (sw2.x < sw1.x && sw1.x < sw2.y && sw2.y < sw1.y) return true;
//       return false;
//    }
// }
