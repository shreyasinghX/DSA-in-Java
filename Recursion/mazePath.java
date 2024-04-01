package Patterns.Recursion;
import java.util.*;

public class mazePath {
    public static void main(String args[]){

        System.out.println(path("",3,3));
        // pathDiagonal("",3,3);

        boolean maze[][]={
            {true, true,true},
            {true,false,true},
            {true,true,true}
        };
        PathRestrictions("", maze, 0, 0);

    }
    public static ArrayList<String> path(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String>list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
            list.addAll(path(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(path(p+'R',r,c-1));
        }
        return list;
    }

    public static void pathDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathDiagonal(p+'d',r-1,c);
        }
        if(c>1){
            pathDiagonal(p+'r',r,c-1);

        }
        if(r>1 && c>1){
            pathDiagonal(p+'D',r-1,c-1);
        }
    }

    public static void PathRestrictions(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
            
        }
        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            PathRestrictions(p +'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            PathRestrictions(p+'R', maze, r, c+1);
        }
    }
}
