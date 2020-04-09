package Controllers;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Sudoku {
    private int [][]grid;
    private int lastNumber;
    private   static List<TextField>Given=new ArrayList<>();
    public static List<TextField> getGiven() {
        return Given;
    }

    Sudoku(){
        grid = new int [9][9];
    }

    // check the row depending on certain value and row number
    private boolean valid_row(int row_number, int val)
    {
        for (int i = 0; i < 9; i++)
        {
            if (grid[row_number][i] == val) return false;
        }
        return  true;
    }

    // check the column depending on certain value and col number
    private boolean valid_col(int col_number, int val){

        for (int i = 0; i < 9; i++)
        {
            if (grid[i][col_number] == val) return false;
        }
        return  true;
    }

    // check the box depending on certain value and box number
    private boolean valid_box(int a, int b, int val)
    {
        int si = 3 * a;
        int ci = 3 * b;

        for (int i = si; i < si + 3; i++)
        {
            for (int j = ci; j < ci + 3; j++)
                if (grid[i][j] == val) return false;
        }
        return  true;
    }

    // get the next free value int the grid or (value equal ot zero) to try to put number int= it to solve the grid
    private int [] get_next(){
        int []arr = new int[2];
        boolean a = false;

        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (grid[i][j] == 0)
                {
                    arr[0] = i;
                    arr[1] = j;
                    a = true;
                    break;
                }
            }
            if (a) break;
        }
        return arr;
    }

    // check if the grid is filled with values or not
    private boolean grid_fill()
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (grid[i][j] == 0) return false;
            }
        }
        return  true;

    }

    // check if the row have any repeated value in any row
    private boolean row_valid()
    {
        for (int j = 0; j < 9; j++)
        {
            int [] freq = new int[10];
            for (int i = 0; i < 9; i++)
            {
                freq[grid[j][i]]++;
            }
            for (int i = 1; i <= 9; i++)
            {
                if (freq[i] > 1) return false;
            }
            if (freq[0] > 0) return  false;
        }
        return  true;
    }

    // check if the column have any repeated value in any col
    private boolean col_valid()
    {
        for (int j = 0; j < 9; j++)
        {
            int [] freq = new int[10];
            for (int i = 0; i < 9; i++)
            {
                freq[grid[i][j]]++;
            }
            for (int i = 1; i <= 9; i++)
            {
                if (freq[i] > 1) return false;
            }
            if (freq[0] > 0) return  false;
        }
        return true;
    }

    private boolean All_valid(){
        return box_valid() && row_valid() && col_valid();
    }

    private boolean valid_All(int row, int col, int val){
        return valid_box(row / 3, col / 3, val) && valid_col(col, val) && valid_row(row, val);
    }


    // check if the box have any repeated value in any box
    private boolean box_valid(){
        int a = 0, b = 0, s1, s2 = 0;
        for (int k = 0; k < 9;  k++)
        {
            int [] freq = new int[10];
            if (a % 3 == 0)
                a = 0;
            {
                if (b % 3 == 0)
                    s2 = (b / 3) * 3;
                b++;
            }
            s1 = a * 3;
            a++;

            for (int i = s2; i < s2+3; i++)
            {
                for (int j = s1; j < s1+3; j++)
                {
                    freq[grid[i][j]]++;
                }
                for (int v = 1; v <= 9; v++)
                {
                    if (freq[v] > 1) return false;
                }
            }
            if (freq[0] > 0) return false;
        }
        return true;
    }

    // generate some values in the grid randomly and put in random position to change the grid each time
    public void generate()
    {
        Random r = new Random();
        grid[0][0] = r.nextInt(9) + 1;
        int cnt = 0;
        while (cnt < 10)
        {
            int pos1 = r.nextInt(9);
            int pos2 = r.nextInt(9);
            int num = r.nextInt(9) + 1;
            if (valid_All(pos1,pos2,num) && grid[pos1][pos2] == 0)
            {
                grid[pos1][pos2] = num;
                cnt++;
            }
        }
    }

    // check if the vector have any repeated pair in it
    private boolean check(Vector<PairClass> v, PairClass p)
    {
        for (PairClass val : v)
        {

            if (val.first == p.first && val.second == p.second) return false;
        }
        return true;
    }

    // function to handle the easy mode
    public void easy_mode() {
        final int required = 40;
        int cnt = 0;
        Vector<PairClass> visited = new Vector<>();
        while (cnt < required) {
            Random r = new Random();
            int pos1 = r.nextInt(9);
            int pos2 = r.nextInt(9);
            int saved = grid[pos1][pos2];
            grid[pos1][pos2] = 0;

            PairClass pair = new PairClass(pos1, pos2);
            if (solve_grid() && lastNumber == saved && check(visited,pair))
            {
                visited.add(pair);
                cnt++;
            }
            grid[pos1][pos2] = saved;
        }
        for (int i = 0; i < required; i++)
        {
            PairClass pair = visited.get(i);
            grid[pair.first][pair.second] = 0;
        }
    }

    // function to handle the medium mode
    public void medium_mode()
    {
        final int required = 50;
        int cnt = 0;
        Vector<PairClass> visited = new Vector<>();
        while (cnt < required) {

            Random r = new Random();
            int pos1 = r.nextInt(9);
            int pos2 = r.nextInt(9);
            int saved = grid[pos1][pos2];
            grid[pos1][pos2] = 0;
            PairClass pair = new PairClass(pos1, pos2);

            if (solve_grid() && lastNumber == saved && check(visited,pair))
            {
                visited.add(pair);
                cnt++;
            }
            grid[pos1][pos2] = saved;
        }
        for (int i = 0; i < required; i++)
        {
            PairClass pair = visited.get(i);
            grid[pair.first][pair.second] = 0;
        }
    }

    // function to handle the hard mode
    public void hard_mode()
    {
        final int required = 60;
        int cnt = 0;
        Vector<PairClass> visited = new Vector<>();
        while (cnt < required)
        {
            Random r = new Random();
            int pos1 = r.nextInt(9);
            int pos2 = r.nextInt(9);
            int saved = grid[pos1][pos2];
            grid[pos1][pos2] = 0;
            PairClass pair = new PairClass(pos1, pos2);
            if (solve_grid() && lastNumber == saved && check(visited,pair))
            {
                visited.add(pair);
                cnt++;
            }
            grid[pos1][pos2] = saved;
        }
        for (int i = 0; i < required; i++)
        {
            PairClass pair = visited.get(i);
            grid[pair.first][pair.second] = 0;
        }
    }


    // main method to solve the grid based of backtracking Algorithm and return true if it is solved
    public boolean solve_grid()
    {
        if (All_valid() && grid_fill()) return true;

        int[] arr = get_next();
        for (int i = 1; i <= 9; i++)
        {
            if (valid_All(arr[0],arr[1],i))
            {
                lastNumber = i;
                grid[arr[0]][arr[1]] = i;
                if (solve_grid()) return true;
                grid[arr[0]][arr[1]] = 0;
            }
        }
        return false;
    }

    void SettingRowData(List<TextField> x, int row){
        for (int i = 0; i < 9; i++)
        {
            if (grid[row][i] != 0)
            {
                x.get(i).setText(String.valueOf(grid[row][i]));
                Given.add(x.get(i));
            }
        }
    }


    void SettingAllData(List<TextField> row0, List<TextField> row1 ,List<TextField> row2,List<TextField> row3 ,List<TextField> row4 ,
              List<TextField> row5, List<TextField> row6, List<TextField> row7, List<TextField> row8){

        SettingRowData(row0,0);
        SettingRowData(row1,1);
        SettingRowData(row2,2);
        SettingRowData(row3,3);
        SettingRowData(row4,4);
        SettingRowData(row5,5);
        SettingRowData(row6,6);
        SettingRowData(row7,7);
        SettingRowData(row8,8);
    }

    public void Play (){
        generate();
        solve_grid();
    }
}
