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
/**
 * 
 function isMale(human)
 {
    return human.gender =='male';
 }
 */
const isMale = (human)=>human.gender=='male';
let males = humans.filter(isMale);
console.log('Males ',males);