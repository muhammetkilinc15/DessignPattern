package a4_BehaivoralDesignPattern.Mediator;

public interface Mediator {
    void notify(Object sender, String event);
}

abstract class BaseComponent {
    protected Mediator _mediator;

    protected BaseComponent(Mediator mediator) {
        this._mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this._mediator = mediator;
    }
}

class ComponentA extends BaseComponent {
    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    public void doA() {
        System.out.println("ComponentA does A.");
        _mediator.notify(this, "AEvent");
    }

    public void doAnotherAction() {
        System.out.println("ComponentA does another action.");
    }
}

class ComponentB extends BaseComponent {
    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    public void doB() {
        System.out.println("ComponentB does B.");
      }

    public void doAnotherAction() {
        System.out.println("ComponentB does another action.");
        _mediator.notify(this, "BEvent");
    }
}




class ConcreteMediator implements Mediator {
    private ComponentA _componentA;
    private ComponentB _componentB;

    public ConcreteMediator(ComponentA componentA, ComponentB componentB) {
        this._componentA = componentA;
        this._componentB = componentB;
        this._componentA.setMediator(this);
        this._componentB.setMediator(this);
    }

    public void notify(Object sender, String event) {
        if (event.equals("AEvent")) {
            System.out.println("Mediator reacts on A and triggers following operations:");
            // Sonsuz döngüyü önlemek için sadece doAnotherAction() çağırıyoruz
            this._componentB.doAnotherAction();
        }
        if (event.equals("BEvent")) {
            System.out.println("Mediator reacts on B and triggers following operations:");
            // Sonsuz döngüyü önlemek için sadece doAnotherAction() çağırıyoruz
            this._componentA.doAnotherAction();
        }
    }
}

class MediatorDemo {
    public static void main(String[] args) {
        ComponentA componentA = new ComponentA(null);
        ComponentB componentB = new ComponentB(null);

        ConcreteMediator mediator = new ConcreteMediator(componentA, componentB);

        System.out.println("=== Test 1: AEvent ===");
        mediator.notify(componentA, "AEvent");

        System.out.println("\n=== Test 2: BEvent ===");
        mediator.notify(componentB, "BEvent");

        System.out.println("\n=== Test 3: Direct component actions ===");
        componentA.doA();
        System.out.println();
        componentB.doB();
    }
}