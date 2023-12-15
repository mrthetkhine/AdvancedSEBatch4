function process(data)
{
    console.log('Process data ',data);
}

function executor(fn)
{
    fn();
}
executor(process.bind(null,'Hello'))