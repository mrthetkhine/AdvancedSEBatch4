let humans = [
    {
        name : 'Mg Hla',
        gender : 'male',
        age : 23
    },
    {
        name : 'Ma Mya',
        gender : 'female',
        age : 30
    },
    {
        name : 'Khin Khin',
        gender : 'female',
        age : 18
    },
    {
        name : 'Aung AUng',
        gender : 'male',
        age : 25
    },

]; 
let males = [];
for(let i=0;i< humans.length;i++)
{
    let human = humans[i];
    if(human.gender=='male')
    {
        males.push(human);
    }
}
console.log('Males ',males);