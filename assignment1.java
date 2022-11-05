class assignment1
{
public static void main(String args[]){
    for( int i=0;i<7;i++)
    {
        if(i==0)
        {
            for(int j=0;j<14;j++)
            {
               System.out.print('*');
            }
        }
        else{
        if (i==3 || i==6)
            {
                for(int k=0;k<14;k++)
                {
                    if (k==3 || k>=7)
                    System.out.print('*');
                    else
                    System.out.print(' ');
                }
            }
        else 
        {
           for(int l=0;l<14;l++)
           {
            if (l==3 || l==7)
            System.out.print('*');
            else
            System.out.print(' ');
           }
        }}
        System.out.println();
    }
}}