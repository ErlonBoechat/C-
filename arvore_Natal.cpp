#include <iostream>
using namespace std;

int main() {
    int i,j;
    int tam=0;
    
    cout<<"*";
    
    for(i=0;i<20;i++)
    {
        tam++;
        cout<<"\n";
        
        for(j=tam;j>0;j--)
        {
        cout<<"w";
        cout<<"v";
        }
    }
    cout<<"\n\nFELIZ NATAL!!!";
    return 0;
}
