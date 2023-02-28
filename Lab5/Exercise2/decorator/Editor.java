
public class Editor {
    public void openProject(String path) {
        Artefact[] artefacts;

        Artifact a1 = new MainArtefact(new BasicArtefact("Main"));
        a1.setStatus(True);
        Artifact a2 = new ErrorArtefact(new BasicArtefact("Demo"));
        a2.setStatus(True);
        Artifact a3 = new MainArtefact(new BasicArtefact("EmailClient"));
        Artifact a4 = new MainArtefact(new BasicArtefact("EmailProvider"));

        artefacts[0].setStatus(true);
        artefacts[2].setStatus(true);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
