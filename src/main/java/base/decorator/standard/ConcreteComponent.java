package base.decorator.standard;

public class ConcreteComponent extends Component {
    //具体实现
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}