const Left =(value)=>({
            value,
            map(fn)
            {
                return Left.of(value);
            },
            matchWith(context)
            {
                //console.log('Failure ',context);
                return context.left(value);
            },
            valueOf()
            {
                return value;
            }
        });
    Left.of = Left;
    const Right =(value)=>({
        value,
        map(fn)
        {
            return Right.of(fn(value));
        },
        matchWith(context)
        {
            //console.log('Sucess ',context);
            return context.right(value);
        },
        valueOf()
        {
            return value;
        }
    });
    Right.of = Right;