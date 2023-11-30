function getSomeValueLater(callback)
{
    setTimeout(()=>{
        console.log('Code executed');
        callback(100);
    },2000);
    console.log('Function exited');
}
getSomeValueLater((data)=>console.log('getSomeValueLater completed We got return value',data));
console.log('Done');