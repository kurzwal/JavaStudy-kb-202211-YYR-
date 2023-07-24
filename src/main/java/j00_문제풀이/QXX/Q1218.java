package j00_문제풀이.QXX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Dot {
   public final int x;
   public final int y;
   Dot (int x, int y) {
      this.x = x;
      this.y = y;
   }
}

public class Q1218 {
   static final int up = 0;
   static final int right = 1;
   static final int down = 2;
   static final int left = 3;
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      int N = Integer.parseInt(br.readLine());
      
      Dot[] dotArr = new Dot[N];
      for (int i = 0; i < N; i++) {
         st = new StringTokenizer(br.readLine());
         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken());
         dotArr[i] = new Dot(x, y);
      }
      for (int i = 0; i < 5; i++) {
         st = new StringTokenizer(br.readLine());
         if (st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            String ans = isAnswer(dotArr, x, y);
            sb.append(ans + "\n");
         } else {
            i--;
         }
      }

      System.out.println(sb);
   }

   public static int getQuadrant(int originX, int originY, Dot otherDot) {
      if (originX == otherDot.x || originY == otherDot.y) return 0;
      if (originX > otherDot.x && originY > otherDot.y) return 1;
      if (originX < otherDot.x && originY > otherDot.y) return 2;
      if (originX < otherDot.x && originY < otherDot.y) return 3;
      return 4;
   }

   public static int oppositeDirection(int inputDirection) {
      if (inputDirection == left) return right;
      else if (inputDirection == right) return left;
      else if (inputDirection == up) return down;
      else if (inputDirection == down) return up;
      else return 0;
   }

   public static int getDirection(Dot curDot, Dot nextDot) {
      if (curDot.x == nextDot.x) {
         if (curDot.y < nextDot.y) return up;
         else return down;
      } else {
         if (curDot.x < nextDot.x) return right;
         else return left;
      }
   }

   public static int getDistance(Dot curDot, Dot nextDot) {
      if (curDot.x == nextDot.x) {
         if (curDot.y < nextDot.y) return nextDot.y - curDot.y;
         else return curDot.y - nextDot.y;
      } else {
         if (curDot.x < nextDot.x) return nextDot.x - curDot.x;
         else return curDot.x - nextDot.x;
      }
   }

   public static String isAnswer(Dot[] dotArr, int originX, int originY) {
      int[] area1Ban = {left, up};
      int[] area2Ban = {down, left};
      int[] area3Ban = {right, down};
      int[] area4Ban = {up, right};
      int[][] banList = {new int[0], area1Ban, area2Ban, area3Ban, area4Ban};
      int[][] directionCheck = new int[5][2];
      int directionStage = 0;
      int len = dotArr.length;
      int prevQuad = getQuadrant(originX, originY, dotArr[0]);
      int prevDirection = getDirection(dotArr[len - 1], dotArr[0]);
      int banDirection = 0;
      for (int i = 0; i < len; i++) {
         Dot curDot = dotArr[i];
         Dot nextDot = dotArr[(i + 1) % len];
         int lineDirection = getDirection(curDot, nextDot);
         int curQuad = getQuadrant(originX, originY, nextDot);
         // Quad check
         if (prevQuad != curQuad) {
            if (prevQuad != 0 && curQuad != 0) {
               if (prevQuad + 1 == curQuad || prevQuad == 4 && curQuad == 1) {
                  directionStage = 0;
               } else {
                  return "NO";
               }
            } else if (prevQuad == 0) {
               int oriDirection = getDirection(new Dot(originX, originY), curDot);
               if (curQuad == 1 && oriDirection == left 
                  || curQuad == 2 && oriDirection == down
                  || curQuad == 3 && oriDirection == right
                  || curQuad == 4 && oriDirection == up) {
                  directionStage = 0;
               } else {
                  directionStage = 1;
                  directionCheck[curQuad][0] = getDistance(curDot, nextDot);
               }
            } else if (curQuad == 0) {
               int oriDirection = getDirection(new Dot(originX, originY), curDot);
               if (prevQuad == 1 && oriDirection == down
                  || prevQuad == 2 && oriDirection == right
                  || prevQuad == 3 && oriDirection == up
                  || prevQuad == 4 && oriDirection == left) {
                  directionStage = 0;
               } else if (prevDirection == banList[prevQuad][0]) {
                  return "NO";
               } else {
                  banDirection = banList[prevQuad][0];
               }
            }
         } else if (prevQuad == 0 && curQuad == 0) {
            if (banDirection != 0 && lineDirection == banDirection)
               return "NO";
         // Direction check
         } else {
            if (prevDirection == banList[curQuad][1] && lineDirection == banList[curQuad][0]) {
               return "NO";
            }
            if (directionStage == 0 && lineDirection == banList[curQuad][0]) {
               directionStage = 1;
               directionCheck[curQuad][0] = getDistance(curDot, nextDot);
            } else if (directionStage == 1) {
               if (lineDirection == banList[curQuad][1]) {
                  return "NO";
               } else if (lineDirection == banList[curQuad][0]) {
                  directionCheck[curQuad][0] += getDistance(curDot, nextDot);
               } else if (lineDirection == oppositeDirection(banList[curQuad][0])) {
                  directionCheck[curQuad][0] -= getDistance(curDot, nextDot);
               }
               if (directionCheck[curQuad][0] <= 0) {
                  directionStage = 2;
               }
            } else if (directionStage == 2) {
               if (lineDirection == banList[curQuad][1]) {
                  directionCheck[curQuad][1] += getDistance(curDot, nextDot);
               } else if (lineDirection == oppositeDirection(banList[curQuad][1])) {
                  directionCheck[curQuad][1] -= getDistance(curDot, nextDot);
               } else if (lineDirection == banList[curQuad][0]) {
                  directionStage = 1;
                  directionCheck[curQuad][0] = getDistance(curDot, nextDot);
               }
               if (directionCheck[curQuad][1] > 0) {
                  return "NO";
               }
            }
         }
         prevQuad = curQuad;
         prevDirection = lineDirection;
      }
      return "YES";
   }
}