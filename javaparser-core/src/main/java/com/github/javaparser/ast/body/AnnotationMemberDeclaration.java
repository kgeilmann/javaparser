/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2016 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */
package com.github.javaparser.ast.body;

import com.github.javaparser.ast.AllFieldsConstructor;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.nodeTypes.NodeWithJavadoc;
import com.github.javaparser.ast.nodeTypes.NodeWithSimpleName;
import com.github.javaparser.ast.nodeTypes.NodeWithType;
import com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier;
import com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPublicModifier;
import com.github.javaparser.ast.observer.ObservableProperty;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.metamodel.AnnotationMemberDeclarationMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import static com.github.javaparser.utils.Utils.assertNotNull;
import javax.annotation.Generated;
import com.github.javaparser.TokenRange;
import java.util.function.Consumer;

/**
 * The "int id();" in <code>@interface X { int id(); }</code>
 *
 * <br/>All annotations preceding the type will be set on this object, not on the type.
 * JavaParser doesn't know if it they are applicable to the method or the type.
 *
 * @author Julio Vilmar Gesser
 */
public final class AnnotationMemberDeclaration extends BodyDeclaration<AnnotationMemberDeclaration> implements NodeWithJavadoc<AnnotationMemberDeclaration>, NodeWithSimpleName<AnnotationMemberDeclaration>, NodeWithType<AnnotationMemberDeclaration, Type>, NodeWithPublicModifier<AnnotationMemberDeclaration>, NodeWithAbstractModifier<AnnotationMemberDeclaration> {

    private EnumSet<Modifier> modifiers;

    private Type type;

    private SimpleName name;

    private Expression defaultValue;

    public AnnotationMemberDeclaration() {
        this(null, EnumSet.noneOf(Modifier.class), new NodeList<>(), new ClassOrInterfaceType(), new SimpleName(), null);
    }

    public AnnotationMemberDeclaration(EnumSet<Modifier> modifiers, Type type, String name, Expression defaultValue) {
        this(null, modifiers, new NodeList<>(), type, new SimpleName(name), defaultValue);
    }

    @AllFieldsConstructor
    public AnnotationMemberDeclaration(EnumSet<Modifier> modifiers, NodeList<AnnotationExpr> annotations, Type type, SimpleName name, Expression defaultValue) {
        this(null, modifiers, annotations, type, name, defaultValue);
    }

    /**This constructor is used by the parser and is considered private.*/
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public AnnotationMemberDeclaration(TokenRange tokenRange, EnumSet<Modifier> modifiers, NodeList<AnnotationExpr> annotations, Type type, SimpleName name, Expression defaultValue) {
        super(tokenRange, annotations);
        setModifiers(modifiers);
        setType(type);
        setName(name);
        setDefaultValue(defaultValue);
        customInitialization();
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public Optional<Expression> getDefaultValue() {
        return Optional.ofNullable(defaultValue);
    }

    /**
     * Return the modifiers of this member declaration.
     *
     * @return modifiers
     * @see Modifier
     */
    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public EnumSet<Modifier> getModifiers() {
        return modifiers;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public SimpleName getName() {
        return name;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public Type getType() {
        return type;
    }

    @Generated("com.github.javaparser.generator.core.node.RemoveMethodGenerator")
    public AnnotationMemberDeclaration removeDefaultValue() {
        return setDefaultValue((Expression) null);
    }

    /**
     * Sets the default value
     *
     * @param defaultValue the default value, can be null
     * @return this, the AnnotationMemberDeclaration
     */
    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public AnnotationMemberDeclaration setDefaultValue(final Expression defaultValue) {
        if (defaultValue == this.defaultValue) {
            return (AnnotationMemberDeclaration) this;
        }
        notifyPropertyChange(ObservableProperty.DEFAULT_VALUE, this.defaultValue, defaultValue);
        if (this.defaultValue != null)
            this.defaultValue.setParentNode(null);
        this.defaultValue = defaultValue;
        setAsParentNodeOf(defaultValue);
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public AnnotationMemberDeclaration setModifiers(final EnumSet<Modifier> modifiers) {
        assertNotNull(modifiers);
        if (modifiers == this.modifiers) {
            return (AnnotationMemberDeclaration) this;
        }
        notifyPropertyChange(ObservableProperty.MODIFIERS, this.modifiers, modifiers);
        this.modifiers = modifiers;
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public AnnotationMemberDeclaration setName(final SimpleName name) {
        assertNotNull(name);
        if (name == this.name) {
            return (AnnotationMemberDeclaration) this;
        }
        notifyPropertyChange(ObservableProperty.NAME, this.name, name);
        if (this.name != null)
            this.name.setParentNode(null);
        this.name = name;
        setAsParentNodeOf(name);
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public AnnotationMemberDeclaration setType(final Type type) {
        assertNotNull(type);
        if (type == this.type) {
            return (AnnotationMemberDeclaration) this;
        }
        notifyPropertyChange(ObservableProperty.TYPE, this.type, type);
        if (this.type != null)
            this.type.setParentNode(null);
        this.type = type;
        setAsParentNodeOf(type);
        return this;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.RemoveMethodGenerator")
    public boolean remove(Node node) {
        if (node == null)
            return false;
        if (defaultValue != null) {
            if (node == defaultValue) {
                removeDefaultValue();
                return true;
            }
        }
        return super.remove(node);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public AnnotationMemberDeclaration clone() {
        return (AnnotationMemberDeclaration) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public AnnotationMemberDeclarationMetaModel getMetaModel() {
        return JavaParserMetaModel.annotationMemberDeclarationMetaModel;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.ReplaceMethodGenerator")
    public boolean replace(Node node, Node replacementNode) {
        if (node == null)
            return false;
        if (defaultValue != null) {
            if (node == defaultValue) {
                setDefaultValue((Expression) replacementNode);
                return true;
            }
        }
        if (node == name) {
            setName((SimpleName) replacementNode);
            return true;
        }
        if (node == type) {
            setType((Type) replacementNode);
            return true;
        }
        return super.replace(node, replacementNode);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isAnnotationMemberDeclaration() {
        return true;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public AnnotationMemberDeclaration asAnnotationMemberDeclaration() {
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifAnnotationMemberDeclaration(Consumer<AnnotationMemberDeclaration> action) {
        action.accept(this);
    }
}
