Promise.reject(3)
      .then(x=>x*2,error=>0)
      .then(console.log)