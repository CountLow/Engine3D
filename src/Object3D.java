public class Object3D {
    public Vector3 position;
    public Vector3[] vertices;

    public Object3D() {

    }

    public Vector3[] getGlobalVertexPositions() {
        Vector3[] vertices = new Vector3[this.vertices.length];

        for (int i = 0; i < this.vertices.length; i++)
            vertices[i] = Vector3.add(this.position, this.vertices[i]);

        return vertices;
    }
}

