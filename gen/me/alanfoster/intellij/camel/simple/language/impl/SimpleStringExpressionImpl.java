// This is a generated file. Not intended for manual editing.
package me.alanfoster.intellij.camel.simple.language.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.alanfoster.intellij.camel.simple.language.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.alanfoster.intellij.camel.simple.language.psi.*;

public class SimpleStringExpressionImpl extends ASTWrapperPsiElement implements SimpleStringExpression {

  public SimpleStringExpressionImpl(ASTNode node) {
    super(node);
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

  @Override
  @NotNull
  public SimpleStringOperator getStringOperator() {
    return findNotNullChildByClass(SimpleStringOperator.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) ((SimpleVisitor)visitor).visitStringExpression(this);
    else super.accept(visitor);
  }

}
