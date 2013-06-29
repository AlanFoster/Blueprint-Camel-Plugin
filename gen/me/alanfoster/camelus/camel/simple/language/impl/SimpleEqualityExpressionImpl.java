// This is a generated file. Not intended for manual editing.
package me.alanfoster.camelus.camel.simple.language.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.alanfoster.camelus.camel.simple.language.psi.*;

public class SimpleEqualityExpressionImpl extends ASTWrapperPsiElement implements SimpleEqualityExpression {

  public SimpleEqualityExpressionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public SimpleEqualityOperator getEqualityOperator() {
    return findNotNullChildByClass(SimpleEqualityOperator.class);
  }

  @Override
  @NotNull
  public SimpleRightHandSide getRightHandSide() {
    return findNotNullChildByClass(SimpleRightHandSide.class);
  }

  @Override
  @NotNull
  public SimpleSimpleExpression getSimpleExpression() {
    return findNotNullChildByClass(SimpleSimpleExpression.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) ((SimpleVisitor)visitor).visitEqualityExpression(this);
    else super.accept(visitor);
  }

}