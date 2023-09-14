class Human
{
    work()
    {
        console.log('Human work');
    }
}
class Doctor extends Human
{
    work()
    {
        console.log('Doctor treat patient ');
    }
}
class Employee 
{
    work()
    {
        console.log('Employee work ');
    }
}
let h = new Employee();
h.work();