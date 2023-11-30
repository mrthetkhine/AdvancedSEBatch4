const fs = require('fs');
let start = new Date();
console.log("Start");
fs.readFile('hello.txt','utf-8',(err,data)=>{
    console.log('File1 read completed ',data.toString().length);
    fs.readFile('hello2.txt','utf-8',(err,data2)=>{
        console.log('File2read completed ',data2.toString().length);
    });
});

console.log('Done');