import java.util.List;

public class Environment {
    public Camera camera;
    public List<Object3D> objects;

    public Environment() {
        camera = new Camera();
    }

    public void update() {

    }

    public void addObject(Object3D obj) {
        objects.add(obj);
    }
}
