    // CS244_002Spr21_Simple_SinglyLinkedListADT.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <ctime>
using namespace std;
template <class E> class SLinkedList; 
/* CS 244 Students: Attention: this is to declare the SLinkedList so that compiler has no problem using it in Node class as a friend
 it is like a prototype */

template <class E>
class SNode {     // singly linked list node
 // provide SLinkedList access
public:
    const E& getElem() const { return elem; };
    SNode<E>* getNext() const { return next; };
private:
    E elem;     // linked list element value
    SNode<E>* next;    // next item in the list
    friend class SLinkedList<E>;
};

template <class E>
class SLinkedList {    // a singly linked list
public:
    SLinkedList();    // empty list constructor
    SLinkedList(SLinkedList<E>&); // copy costructor
    ~SLinkedList();    // destructor
    SLinkedList<E>& operator=(SLinkedList<E>&); // assignment operator

    bool empty() const;    // is list empty?
    const E& front() const;   // return front element
    void addFront(const E& e);   // add to front of list
    void addBack(const E& e);
    void removeFront();    // remove front item list
    SNode<E>* getHead() const { return head; };   // return head address
    SNode<E>* getTail() const { return tail; };
    E getAvr() {
        double avg;
        if (!empty()) {
            
        }
        return avg;
    }
private:
    SNode<E>* head;    // head of the list
    SNode<E>* tail;    // tail of the list
 
};

template <class E>
SLinkedList<E>::SLinkedList()    // constructor
    : head(NULL), tail(NULL) { }

template <class E>
bool SLinkedList<E>::empty()const   // is list empty?
{
    return head == NULL;
}

template <class E>
const E& SLinkedList<E>::front() const  // return front element
{
    return head->elem;
}

template <class E>
void SLinkedList<E>::addFront(const E& e) {  // add to front of list

    SNode<E>* v = new SNode<E>;    // create new node
    v->elem = e;     // store data
    v->next = head;     // head now follows v
    head = v;

    if (tail == NULL)
        tail = v;// v is now the head
}

template <class E>
void SLinkedList<E>::addBack(const E& e) {  // add to back of list
    SNode<E>* newNode = new SNode<E>;
    newNode->elem = e;
    newNode->next = NULL;
    if (tail == NULL)
    {
        newNode->next = tail;
        tail = newNode;
        head = newNode;
        //return;
    }
    else {
        tail->next = newNode;
        tail = tail->next;
        //tail->next = NULL;
    }
}

template <class E>
void SLinkedList<E>::removeFront() {   // remove front item
    SNode<E>* old = head;    // save current head
    head = old->next;     // skip over old head
    if (head == NULL) tail = NULL;
    delete old;      // delete the old head
}

template <class E>
SLinkedList<E>::~SLinkedList()   // destructor
{
    while (!empty()) 
        removeFront();
}

//overloading assignment operator
template <class E>
SLinkedList<E>& SLinkedList<E>::operator=(SLinkedList<E>& rhs) // assignment operator
{
    if (this != &rhs) {  //Why? protection against self assignment.
        while (head != NULL) // first, empty list
            removeFront();
        //SNode* current = rhs.first; // set ptr to first link

        for (SNode<E>* current = rhs.head; current != NULL; current = current->getNext())
        {
          //  cout << "Copying: " << current->getElem() <<endl;
            addBack(current->getElem());
        }//end for

    }
    return *this;
}
// copy constrcutor: here I had to change the parameter from const to non-const because we can not assign a const list to non-const list
template <class E>
SLinkedList<E>::SLinkedList(SLinkedList<E>& obj) : head(NULL), tail(NULL)
{
    *this = obj;
}// end of copy structor 4


/*****/
template <class E>
void printSLL(SLinkedList<E> sll) {
    int nodeRank = 0;
    for (SNode<int>* current = sll.getHead(); current != NULL; current = current->getNext())
    {
        ++nodeRank;
        cout << "localSLL.Node " << nodeRank << ": " << current->getElem() << endl;

    }//end for
}
template<class E>

int main()
{
    srand(time(nullptr));

    SLinkedList<int> intSLL1;
    for (int i = 0; i < 10; ++i)
        intSLL1.addBack(rand()%101);
    int nodeRank = 0;
    for (SNode<int>* current = intSLL1.getHead(); current != NULL; current = current->getNext())
    {
        ++nodeRank;
        cout << "intSLL1.Node "<< nodeRank<<": " << current->getElem() << endl;
   
    }//end for
    SNode<int>* current = intSLL1.getHead();
    while (current != NULL) {
        ++nodeRank;
        cout << "intSLL1.Node " << nodeRank << ": " << current->getElem() << endl; 
        current=current->getNext();
    }

    { /*use this blocck to test the assignment overloading*/
        SLinkedList<int> intSLL2;
        for (int i = 0; i < 10; ++i)
            intSLL2.addFront(rand() % 101);
        nodeRank = 0;
        for (SNode<int>* current = intSLL2.getHead(); current != NULL; current = current->getNext())
        {
            ++nodeRank;
            cout << "intSLL2.Node " << nodeRank << ": " << current->getElem() << endl;
        }//end for

        //coding 
        intSLL2 = intSLL1;

        if(intSLL2.empty()) /*testing the assignment overloading*/
            cout<< "intSLL2 is empty. Fail!"<<endl;
        nodeRank = 0;
        for (SNode<int>* current = intSLL2.getHead(); current != NULL; current = current->getNext())
        {
            ++nodeRank;
            cout << "after assigning. intSLL2.Node " << nodeRank << ": " << current->getElem() << endl;
        }//end for
    }

    nodeRank = 0;
    for (SNode<int>* current = intSLL1.getHead(); current != NULL; current = current->getNext())
    {
        ++nodeRank;
        cout << "intSLL1.Node " << nodeRank << ": " << current->getElem() << endl;

    }//end for



     /*use this block to test the copy constructor*/
    printSLL(intSLL1);
    
        
    nodeRank = 0;
    for (SNode<int>* current = intSLL1.getHead(); current != NULL; current = current->getNext())
    {
        ++nodeRank;
        cout << "caller.intSLL1.Node " << nodeRank << ": " << current->getElem() << endl;

    }//end for
    return 0;

    } /*end main*/