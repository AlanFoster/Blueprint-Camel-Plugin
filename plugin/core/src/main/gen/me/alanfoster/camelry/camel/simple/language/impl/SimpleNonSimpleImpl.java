// This is a generated file. Not intended for manual editing.
package me.alanfoster.camelry.camel.simple.language.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.alanfoster.camelry.camel.simple.language.psi.*;
public class SimpleNonSimpleImpl extends ASTWrapperPsiElement implements SimpleNonSimple {

  public SimpleNonSimpleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) ((SimpleVisitor)visitor).visitNonSimple(this);
    else super.accept(visitor);
  }

}
