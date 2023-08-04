function delayDiv(a,b)
{
    console.log('delay div started');
    setTimeout(()=>{
        if( isNaN(a) || isNaN(b))
        {
            throw new Error('A or b is NaN');
        }
        console.log('a/b is ', a/b);
    },1000);
}
console.log('Before');
try
{
    delayDiv(10,NaN);
}
catch(error)
{
    console.log('Error get caughted',error);
}

console.log('Done');