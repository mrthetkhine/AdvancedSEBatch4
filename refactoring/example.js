let invoices = {
  "customer": "BigCo",
  "performances": [
    {
      "playID": "hamlet",
      "audience": 55
    },
    {
      "playID": "as-like",
      "audience": 35
    },
    {
      "playID": "othello",
      "audience": 40
    }
  ]
};
let plays = {
  "hamlet": {"name": "Hamlet", "type": "tragedy"},
  "as-like": {"name": "As You Like It", "type": "comedy"},
  "othello": {"name": "Othello", "type": "tragedy"}
};
function amountFor( aPerformance) {
    let result = 0;
    let play = playFor(aPerformance);
    switch (play.type) {
        case "tragedy":
            result = 40000;
            if (aPerformance.audience > 30) {
                result += 1000 * (aPerformance.audience - 30);
            }
            break;
        case "comedy":
            result = 30000;
            if (aPerformance.audience > 20) {
                result += 10000 + 500 * (aPerformance.audience - 20);
            }
            result += 300 * aPerformance.audience;
            break;
        default:
            throw new Error(`unknown type: ${play.type}`);
    }
    return result;
}
function playFor(aPerformance) { 
    return plays[aPerformance.playID];
}
function volumeCreditFor(aPerformance)
{
    let play = playFor(aPerformance);
    let volumeCredits = Math.max(aPerformance.audience - 30, 0);
    if ("comedy" === play.type) volumeCredits += Math.floor(aPerformance.audience / 5);
    return volumeCredits;
}
function getFormat()
{
    return new Intl.NumberFormat("en-US",
    { style: "currency", currency: "USD",
        minimumFractionDigits: 2 }).format;
}
function getTotalVolumeCredit(invoice ) {
    let volumeCredits =0;
    for (let perf of invoice.performances) {
        // add volume credits
        volumeCredits += volumeCreditFor(perf);
    }
    return volumeCredits;
}
function statement (invoice, plays) {
    let totalAmount = 0;
    let result = `Statement for ${invoice.customer}\n`;
    const format = getFormat();
    for (let perf of invoice.performances) {
        const play = playFor(perf);
        let thisAmount = amountFor( perf);
        // print line for this order
        result += ` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
        totalAmount += thisAmount;
    }
  
    let volumeCredits = getTotalVolumeCredit(invoice);
    result += `Amount owed is ${format(totalAmount/100)}\n`;
    result += `You earned ${volumeCredits} credits\n`;
    return result;
}
let result = statement(invoices,plays);
console.log('Result ',result);




