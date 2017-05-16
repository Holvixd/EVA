var MainBox  = React.createClass({
    render:function(){
        return(
            <App/>
        );
    }
});

var App = React.createClass({
    //setting up initial state
    getInitialState:function(){
        return{
            data:[]
        };
    },
    componentDidMount(){
        this.getDataFromServer('http://localhost:8080/showShoppingCart');
    },
    //showResult Method
    showResult: function(response) {
        this.setState({
            data: response
        });
    },
    //making ajax call to get data from server
    getDataFromServer:function(URL){
        $.ajax({
            type:"GET",
            dataType:"json",
            url: URL,
            success: function(response) {
                this.showResult(response);
            }.bind(this),
            error: function(xhr, status, err) {
                console.error(this.props.url, status, err.toString());
            }.bind(this)
        });
    },
    render:function(){
        return(
            <div>
            <Result result={this.state.data}/>
        </div>
        );
    }
});

var Result = React.createClass({
    render:function(){
        var result = this.props.result.map(function(result,index){
            return <ResultItem key={index} user={ result } />
        });
        return(
            <div className="container">
            <div className="row">
            {result}
            </div>
            </div>
        );
    }
});
class ResultItem extends React.Component{
    constructor(props){
        super(props);

    }

    render(){
        var camper = this.props.user;
        return(
            <div className="col-xs-6 col-sm-4 col-md-3">
            <div className="item">
            <div className="col-xs-12"><h3>{camper.name}</h3></div>
        <div className="col-xs-12"><img src={camper.picture} /></div>
        <div className="col-xs-12"><p>Hinta:&nbsp;{camper.price}</p></div>
        <div className="col-xs-12"><p>Paino:&nbsp;{camper.weight}</p></div>
        </div>
        </div>
    );
    }
}

ReactDOM.render(<MainBox />, document.getElementById('app'));