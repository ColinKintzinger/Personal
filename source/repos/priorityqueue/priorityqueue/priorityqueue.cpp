// priorityqueue.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

//Please take a look at the course book for more details on why
//to use comparators
//Dr. Alnaeli
//CS 244
#include<iostream>
#include <string >

using namespace std;



class Point2D {
public:
    Point2D(int _x_, int _y_) {
        x = _x_;  y = _y_;
    }
    void setX(int _x_) {
        x = _x_;
    }
    void setY(int _y_) {
        y = _y_;
    }
    int getX() const { return x; } // make sure you make this const

    int getY() const { return y; }// make sure you make this const

    string getXY() const
    {
        return ("[" + to_string(x) + "," + to_string(y) + "]");
    }

    bool operator< (const Point2D& q); //one solution, but not practical

private:
    int x;  int y;
};
bool Point2D::operator< (const Point2D& q) { //one solution, but not practical
    if (getX() == q.getX())
        return getY() < q.getY();
    else
        return getX() < q.getX();
}
class LeftRight { // left-right comparator
public:
    bool operator()(const Point2D& p, const Point2D& q) const
    {
        return (p.getX() < q.getX());
    }
};

class BottomTop { // bottom-top
public:
    bool operator()(const Point2D& p, const Point2D& q) const
    {
        return p.getY() < q.getY();
    }
};
class equals { // bottom-top
public:
    bool operator()(const Point2D& p, const Point2D& q) const
    {
        return p.getY() == q.getY()&&p.getX() ==q.getX();
    }
};

template <typename E, typename C> // element type and comparator
void printSmaller(const E& p, const E& q, const C& isLess) {
    if (isLess(p, q))
        cout << p.getXY();
    else
        cout << q.getXY();

    //cout << (isLess(p, q) ? p : q) << endl;  // print the smaller of p and q

}
//-------------------------------------------------------
int main() {

    Point2D p1(10, 5);
    cout << " p1 ---> " << p1.getXY() << endl;

    Point2D p2(5, 10);
    cout << " p2 ---> " << p2.getXY() << endl;

    //1: compare using the operator< overloading
    cout << "Compared by the overloaded operator < :\n";
    if (p1 < p2)
        cout << p1.getXY();
    else
        cout << p2.getXY();

    cout << endl;
    //2: compare using the comparators
    LeftRight leftRight; // a left-right comparator
    BottomTop bottomTop; // a bottom-top comparator
    cout << "Compared using leftRight comparator:\n";
    printSmaller(p1, p2, leftRight);
    cout << endl;

    cout << "Compared using bottomTop comparator:\n";
    printSmaller(p1, p2, bottomTop);
    cout << endl;
    //------------------------------------------------------

    return 0;
}
