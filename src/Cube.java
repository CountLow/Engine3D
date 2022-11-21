public class Cube extends Object3D {

    public Cube(float l) {
        vertices = new Vector3[8];

        vertices[0] = new Vector3(-l, -l, -l);
        vertices[1] = new Vector3(-l, -l,  l);
        vertices[2] = new Vector3(-l,  l, -l);
        vertices[3] = new Vector3(-l,  l,  l);

        vertices[4] = new Vector3( l, -l, -l);
        vertices[5] = new Vector3( l, -l,  l);
        vertices[6] = new Vector3( l,  l, -l);
        vertices[7] = new Vector3( l,  l,  l);
    }
}
