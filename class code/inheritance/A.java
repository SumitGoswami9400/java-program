#include<iostream>
#define max 5
using namespace std;

class stack
{
    int A[max],top;
    public:
    stack()
    {
        top=-1;
    }
    void push()
    {
        if(top==max-1)
        cout<<"\nStack is full";
        else
        {
            cout<<"\nEnter the value:";
            top++;
            cin>>A[top];
        }
    }
    void pop()
    {
        if(top==-1)
        cout<<"\nStack is empty";
        else
        {
            cout<<"\nPoped element is:"<<A[top];
            top--;
        }
    }
    void disp()
    {
        if(top==-1)
        cout<<"\nStack is empty";
        else
        {
            for(int i=top;i>=0;i--)
            cout<<A[i]<<"\n";
        }
    }
};


int main()
{
    int ch;
    stack s;
    while(1)
    {
        cout<<"\n1.Push\n2.Pop\n3.Display\n4.Exit\nEnter your choice:";
        cin>>ch;
        switch(ch)
        {
            case 1:s.push();
            break;
            case 2:s.pop();
            break;
            case 3:s.disp();
            break;
            case 4:exit(0);
            default:cout<<"\nInvalid choice";
            break;
        }
    }
}
