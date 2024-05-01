
import java.util.*;
class TicTacToe_Advanced_Org
{
    char box[][]=new char[3][3];
    TicTacToe_Advanced_Org()
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                box[i][j]=' ';
            }
        }
    }

    boolean isOccupied(int x)//to check if the entered box is occupied or not
    {
        int i,j;
        char ci,cj;
        boolean b;
        String s;
        s=converter(x);
        ci=s.charAt(0);
        cj=s.charAt(1);
        i=Character.getNumericValue(ci);
        j=Character.getNumericValue(cj);
        if(box[i][j]!=' ')
        {
            b= true;
        }
        else
        {
            b=false;
        }
        return b;
    }

    char checker()//to check if a player matched the grid with the given symbol vertically, horizontally or diagona;;y
    {
        char z=' ';
        if(box[0][0]==box[0][1]&&box[0][1]==box[0][2]&&box[0][0]!=' '&&box[0][1]!=' '&&box[0][2]!=' ')
        {
            z=box[0][1];
        }
        else if(box[1][0]==box[1][1]&&box[1][1]==box[1][2]&&box[1][0]!=' '&&box[1][1]!=' '&&box[1][2]!=' ')
        {
            z=box[1][1];
        }
        else if(box[2][0]==box[2][1]&&box[2][1]==box[2][2]&&box[2][0]!=' '&&box[2][1]!=' '&&box[2][2]!=' ')
        {
            z=box[0][1];
        }
        else if(box[0][0]==box[1][0]&&box[1][0]==box[2][0]&&box[0][0]!=' '&&box[1][0]!=' '&&box[2][0]!=' ')
        {
            z=box[1][0];
        }
        else if(box[0][1]==box[1][1]&&box[1][1]==box[2][1]&&box[0][1]!=' '&&box[1][1]!=' '&&box[2][1]!=' ')
        {
            z=box[1][1];
        }
        else if(box[0][2]==box[1][2]&&box[1][2]==box[2][2]&&box[0][2]!=' '&&box[1][2]!=' '&&box[2][2]!=' ')
        {
            z=box[1][2];
        }
        else if(box[0][0]==box[1][1]&&box[1][1]==box[2][2]&&box[0][0]!=' '&&box[1][1]!=' '&&box[2][2]!=' ')
        {
            z=box[1][1];
        }
        else if(box[2][0]==box[1][1]&&box[1][1]==box[0][2]&&box[2][0]!=' '&&box[1][1]!=' '&&box[0][2]!=' ')
        {
            z=box[1][1];
        }
        return z;
    }

    char h(int x)//to refer to the array indices of the box just by using their number to shorten the written conditions in randomChooser2()
    {
        int i,j;
        char ci,cj;
        char b;
        String s;
        s=converter(x);
        ci=s.charAt(0);
        cj=s.charAt(1);
        i=Character.getNumericValue(ci);
        j=Character.getNumericValue(cj);
        b=box[i][j];
        return b;
    }

    int randomChooser2(char z,char y)//this enables the computer to pick boxes logically rather than randomly
    {
        int r=0,i;
        if(h(1)==y&&h(2)==y&&h(3)==' ')
        {
            r=3;
        }
        else if(h(2)==y&&h(3)==y&&h(1)==' ')
        {
            r=1;
        }
        else if(h(3)==y&&h(1)==y&&h(2)==' ')
        {
            r=2;
        }
        else if(h(4)==y&&h(5)==y&&h(6)==' ')
        {
            r=6;
        }
        else if(h(5)==y&&h(6)==y&&h(4)==' ')
        {
            r=4;
        }
        else if(h(6)==y&&h(4)==y&&h(5)==' ')
        {
            r=5;
        }
        else if(h(7)==y&&h(8)==y&&h(9)==' ')
        {
            r=9;
        }
        else if(h(8)==y&&h(9)==y&&h(7)==' ')
        {
            r=7;
        }
        else if(h(9)==y&&h(7)==y&&h(8)==' ')
        {
            r=8;
        }
        else if(h(1)==y&&h(4)==y&&h(7)==' ')
        {
            r=7;
        }
        else if(h(4)==y&&h(7)==y&&h(1)==' ')
        {
            r=1;
        }
        else if(h(7)==y&&h(1)==y&&h(4)==' ')
        {
            r=4;
        }
        else if(h(2)==y&&h(5)==y&&h(8)==' ')
        {
            r=8;
        }
        else if(h(5)==y&&h(8)==y&&h(2)==' ')
        {
            r=2;
        }
        else if(h(8)==y&&h(2)==y&&h(5)==' ')
        {
            r=5;
        }
        else if(h(3)==y&&h(6)==y&&h(9)==' ')
        {
            r=9;
        }
        else if(h(6)==y&&h(9)==y&&h(3)==' ')
        {
            r=3;
        }
        else if(h(9)==y&&h(3)==y&&h(6)==' ')
        {
            r=6;
        }
        else if(h(1)==y&&h(5)==y&&h(9)==' ')
        {
            r=9;
        }
        else if(h(9)==y&&h(1)==y&&h(5)==' ')
        {
            r=5;
        }
        else if(h(5)==y&&h(9)==y&&h(1)==' ')
        {
            r=1;
        }
        else if(h(3)==y&&h(5)==y&&h(7)==' ')
        {
            r=7;
        }
        else if(h(7)==y&&h(3)==y&&h(5)==' ')
        {
            r=5;
        }
        else if(h(5)==y&&h(7)==y&&h(3)==' ')
        {
            r=3;
        }
        else if(h(1)==z&&h(2)==z&&h(3)==' ')
        {
            r=3;
        }
        else if(h(2)==z&&h(3)==z&&h(1)==' ')
        {
            r=1;
        }
        else if(h(3)==z&&h(1)==z&&h(2)==' ')
        {
            r=2;
        }
        else if(h(4)==z&&h(5)==z&&h(6)==' ')
        {
            r=6;
        }
        else if(h(5)==z&&h(6)==z&&h(4)==' ')
        {
            r=4;
        }
        else if(h(6)==z&&h(4)==z&&h(5)==' ')
        {
            r=5;
        }
        else if(h(7)==z&&h(8)==z&&h(9)==' ')
        {
            r=9;
        }
        else if(h(8)==z&&h(9)==z&&h(7)==' ')
        {
            r=7;
        }
        else if(h(9)==z&&h(7)==z&&h(8)==' ')
        {
            r=8;
        }
        else if(h(1)==z&&h(4)==z&&h(7)==' ')
        {
            r=7;
        }
        else if(h(4)==z&&h(7)==z&&h(1)==' ')
        {
            r=1;
        }
        else if(h(7)==z&&h(1)==z&&h(4)==' ')
        {
            r=4;
        }
        else if(h(2)==z&&h(5)==z&&h(8)==' ')
        {
            r=8;
        }
        else if(h(5)==z&&h(8)==z&&h(2)==' ')
        {
            r=2;
        }
        else if(h(8)==z&&h(2)==z&&h(5)==' ')
        {
            r=5;
        }
        else if(h(3)==z&&h(6)==z&&h(9)==' ')
        {
            r=9;
        }
        else if(h(6)==z&&h(9)==z&&h(3)==' ')
        {
            r=3;
        }
        else if(h(9)==z&&h(3)==z&&h(6)==' ')
        {
            r=6;
        }
        else if(h(1)==z&&h(5)==z&&h(9)==' ')
        {
            r=9;
        }
        else if(h(9)==z&&h(1)==z&&h(5)==' ')
        {
            r=5;
        }
        else if(h(5)==z&&h(9)==z&&h(1)==' ')
        {
            r=1;
        }
        else if(h(3)==z&&h(5)==z&&h(7)==' ')
        {
            r=7;
        }
        else if(h(7)==z&&h(3)==z&&h(5)==' ')
        {
            r=5;
        }
        else if(h(5)==z&&h(7)==z&&h(3)==' ')
        {
            r=3;
        }
        else
        {
            for(i=1;1>0;i++)
            {
                r=(int)(Math.random()*10)+1;
                if(r>0&&r<10&&(!isOccupied(r)))
                {
                    break;
                }
            }
        }
        return r;
    }

    int randomChooser()//to pick a box randomly
    {
        int i,s;
        for(i=1;1>0;i++)
        {
            s=(int)(Math.random()*10)+1;
            if(s>0&&s<10&&(!isOccupied(s)))
            {
                break;
            }
        }
        return s;
    }

    boolean chooser(int x)//to check if the entered value(1 or 2) matches with a random generated value(1 or 2)
    {
        int s=random();
        if(s==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    int random()//generates a random value(1 or 2)
    {
        int i,s;
        for(i=1;1>0;i++)
        {
            s=(int)(Math.random()*10)+1;
            if(s>0&&s<3)
            {
                break;
            }
        }
        return s;
    }

    String converter(int y)//converts tthe boxe numbers to array indices
    {
        String r=" ";
        if(y==1)
        {
            r="00";
        }
        else if(y==2)
        {
            r="01";
        }
        else if(y==3)
        {
            r="02";
        }
        else if(y==4)
        {
            r="10";
        }
        else if(y==5)
        {
            r="11";
        }
        else if(y==6)
        {
            r="12";
        }
        else if(y==7)
        {
            r="20";
        }
        else if(y==8)
        {
            r="21";
        }
        else if(y==9)
        {
            r="22";
        }
        return r;
    }

    void reinitializer(int z,char ch)//reinitializes a value of a box to either 'O' or 'X' depending on the conditions
    {
        String s;
        int i,j;
        char ci,cj;
        s=converter(z);
        ci=s.charAt(0);
        i=Integer.parseInt(String.valueOf(ci));
        cj=s.charAt(1);
        j=Integer.parseInt(String.valueOf(cj));
        box[i][j]=ch;
    }

    void boxMaker()//to make the 3×3 grid where the game will be played
    {
        System.out.println(" "+box[0][0]+" | "+box[0][1]+" | "+box[0][2]);
        System.out.println("---+---+---");
        System.out.println(" "+box[1][0]+" | "+box[1][1]+" | "+box[1][2]);
        System.out.println("---+---+---");
        System.out.println(" "+box[2][0]+" | "+box[2][1]+" | "+box[2][2]);
    }

    public static void main(String args[]) throws InterruptedException//main method that contains the necessary set of conditions to conduct the game
    {
        TicTacToe_Advanced_Org ob=new TicTacToe_Advanced_Org();
        boolean go=false;
        int ht,xo,xol,htl,uv,cv,fll,turn,b=0,bl,gs,bp,dl=1,dll,ra=1,xoc=1;
        char fl=' ',user=' ',comp=' ',checker=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println(" 1 | 2 | 3");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9");
        System.out.println();
        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Normal");
        for(dll=1;dll>0;dll++)
        {
            System.out.print("Enter your choice: ");
            dl=sc.nextInt();
            if(dl>0&&dl<3)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input. Try again.");
            }
        }
        System.out.println();
        System.out.println("---Choose---");
        System.out.println("1. Heads");
        System.out.println("2. Tails");
        for(htl=1;htl>0;htl++)
        {
            System.out.print("Enter your choice: ");
            ht=sc.nextInt();
            if(ob.chooser(ht))
            {
                System.out.println("You won the toss.");
                System.out.println();
                System.out.println("What would you like to play with?");
                System.out.println("1. X");
                System.out.println("2. O");
                for(xol=1;xol>0;xol++)
                {
                    System.out.print("Enter your choice: ");
                    xo=sc.nextInt();
                    if(xo==1)
                    {
                        user='X';
                        comp='O';
                        break;
                    }
                    else if(xo==2)
                    {
                        comp='X';
                        user='O';
                        break;
                    }
                    else
                    {
                        System.out.println("Incorrect input. Try again.");
                    }
                }
                System.out.println();
                System.out.print("Would you like to go first?(y/n): ");
                fl=sc.next().charAt(0);
                System.out.println();
                break;
            }
            else
            {
                ra=ob.random();
                System.out.println();
                if(ob.chooser(ra))
                {
                    fl='n';
                    xoc=ob.random();
                    if(xoc==1)
                    {
                        comp='X';
                        user='O';
                        System.out.println("Computer choose to go first and play with 'X'");
                    }
                    else
                    {
                        comp='O';
                        user='X';
                        System.out.println("Computer choose to go first and play with 'O'");
                    }
                }
                else
                {
                    fl='y';
                    xoc=ob.random();
                    if(xoc==1)
                    {
                        comp='X';
                        user='O';
                        System.out.println("Computer choose to go second and play with 'X'");
                    }
                    else
                    {
                        comp='O';
                        user='X';
                        System.out.println("Computer choose to go second and play with 'O'");
                    }
                }
                System.out.println();
                break;
            }
        }
        System.out.println();
        System.out.print("Your game will be starting in 5 sec");
        Thread.sleep(5000);
        if(fl=='y')
        {
            uv=2;
            for(turn=1;turn<=10;turn++)
            {
                System.out.println("\u000C");
                ob.boxMaker();
                if(go)
                {
                    System.out.println();
                    System.out.println("GAME OVER");
                    break;
                }
                if(turn%uv==1)
                {
                    for(bl=1;bl>0;bl++)
                    {
                        System.out.println("Enter your box: ");
                        b=sc.nextInt();
                        if(b>0&&b<10&&(!ob.isOccupied(b)))
                        {
                            break;
                        }
                        else if(ob.isOccupied(b))
                        {
                            System.out.println("That square is already taken. Try again.");
                        }
                        else
                        {
                            System.out.print("Incorrect input. Try again.");
                        }
                    }
                    ob.reinitializer(b,user);
                }
                else if(turn%uv==0)
                {
                    if(dl==1)
                    {
                        ob.reinitializer(ob.randomChooser(),comp);
                    }
                    else
                    {
                        ob.reinitializer(ob.randomChooser2(user,comp),comp);
                    }
                }
                checker=ob.checker();
                if(checker==user||checker==comp||turn==9)
                {
                    go=true;
                }
            }
        }
        else
        {
            cv=2;
            for(turn=1;turn<=10;turn++)
            {
                System.out.println("\u000C");
                ob.boxMaker();
                if(go)
                {
                    System.out.println();
                    System.out.println("GAME OVER");
                    break;
                }
                if(turn%cv==1)
                {
                    if(dl==1)
                    {
                        ob.reinitializer(ob.randomChooser(),comp);
                    }
                    else
                    {
                        ob.reinitializer(ob.randomChooser2(user,comp),comp);
                    }
                }
                else if(turn%cv==0)
                {
                    for(bl=1;bl>0;bl++)
                    {
                        System.out.println("Enter your box: ");
                        b=sc.nextInt();
                        if(b>0&&b<10&&(!ob.isOccupied(b)))
                        {
                            break;
                        }
                        else if(ob.isOccupied(b))
                        {
                            System.out.println("That square is already taken. Try again.");
                        }
                        else
                        {
                            System.out.print("Incorrect input. Try again.");
                        }
                    }
                    ob.reinitializer(b,user);
                }
                checker=ob.checker();
                if(checker==user||checker==comp||turn==9)
                {
                    go=true;
                }
            }
        }
        System.out.println();
        if(checker==user)
        {
            System.out.println("You win.");
        }
        else if(checker==comp)
        {
            System.out.println("Computer wins.");
        }
        else
        {
            System.out.println("It is a draw.");
        }
    }
}
