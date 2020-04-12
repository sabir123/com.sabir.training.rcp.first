package com.sabir.training.rcp.first;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class FirstViewPart extends ViewPart {

	public FirstViewPart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Label label = new Label ( parent , SWT.NONE);
		label.setText("Welcome to First View");
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
