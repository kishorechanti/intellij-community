// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.refactoring.introduceParameterObject;

import com.intellij.psi.PsiElement;
import com.intellij.refactoring.RefactoringBundle;
import com.intellij.refactoring.ui.UsageViewDescriptorAdapter;
import com.intellij.usageView.UsageViewBundle;
import org.jetbrains.annotations.NotNull;

public class IntroduceParameterObjectUsageViewDescriptor extends UsageViewDescriptorAdapter {

  private final PsiElement method;

  public IntroduceParameterObjectUsageViewDescriptor(PsiElement method) {
    this.method = method;
  }

  @Override
  @NotNull
  public PsiElement[] getElements() {
    return new PsiElement[]{method};
  }

  @Override
  public String getProcessedElementsHeader() {
    return RefactoringBundle.message("refactoring.introduce.parameter.object.method.whose.parameters.are.to.wrapped");
  }

  @Override
  public String getCodeReferencesText(int usagesCount, int filesCount) {
    return RefactoringBundle.message("refactoring.introduce.parameter.object.references.to.be.modified") +
           UsageViewBundle.getReferencesString(usagesCount, filesCount);
  }
}
