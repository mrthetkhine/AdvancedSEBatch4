type Color = 'red'| 'green' |'blue';

let color: Color = 'red';

type Leaf = {
    data : string
};
type TNode ={
    data : string,
    left : TNode,
    right : TNode  
}
type Tree = Leaf
            | TNode
const tree = {
    data : 'A',
    left : {
        data : 'B'
    },
    right : {
        data : 'C',
        left:{
            data : 'D'
        },
        right : {
            data : 'E'
        }
    }
}