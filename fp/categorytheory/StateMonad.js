function push(element)
{
    return function(stack)
    {
        return [undefined,[...stack,element]];
    }
    
}
function pop()
{
    return function(stack)
    {
        return [stack[stack.length-1],stack.slice(0,stack.length-1)];
    }   
}
//sts=state=>[value,state]
//push(10)
//pop()
const State = (st)=>({
    runWith(state)
    {
        return st(state);
    }
});
State.of = State;
let stack = State.of(push(10))
                  .runWith([]);
console.log('Stack ',stack);