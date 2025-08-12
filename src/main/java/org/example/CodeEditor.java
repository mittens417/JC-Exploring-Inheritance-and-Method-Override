package org.example;


class CodeEditor extends Editor {
    @Override
    public void openFile() {
        System.out.println("Applying syntax highlighting...");
        super.openFile(); // Call the parent's method
    }
}