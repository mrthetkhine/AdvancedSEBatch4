function method1()
{
    console.log('Method 1 business logic');
}
function method2()
{
    console.log('Method 2 business logic');
}
function logger(fn)
{
    return function()
    {
        console.log(fn.name , ' was called');
        return fn();
    }
}
let m1 = logger(method1);
m1();
let m2 = logger(method2);
m2();