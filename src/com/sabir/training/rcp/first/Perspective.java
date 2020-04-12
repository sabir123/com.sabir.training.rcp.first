package com.sabir.training.rcp.first;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override	
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
        layout.setEditorAreaVisible(false);
        layout.setFixed(true);
		layout.addView("com.sabir.training.rcp.first.viewID", IPageLayout.TOP,
                IPageLayout.RATIO_MAX, IPageLayout.ID_EDITOR_AREA);
	}
}
