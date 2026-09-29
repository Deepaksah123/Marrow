###### Class com.fasterxml.jackson.databind.deser.impl.CreatorCandidate (com.fasterxml.jackson.databind.deser.impl.CreatorCandidate)
.class public final Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;
    }
.end annotation


# instance fields
.field protected final _creator:Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;

.field protected final _intr:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

.field protected final _paramCount:I

.field protected final _params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;I)V
    .registers 5

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_intr:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 20
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_creator:Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;

    .line 21
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    .line 22
    iput p4, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_paramCount:I

    return-void
.end method

.method public static construct(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;[Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;)Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;
    .registers 10

    .line 28
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterCount()I

    move-result v0

    .line 29
    new-array v1, v0, [Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v0, :cond_21

    .line 31
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameter(I)Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;

    move-result-object v3

    .line 32
    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findInjectableValue(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/annotation/JacksonInject$Value;

    move-result-object v4

    if-nez p2, :cond_15

    const/4 v5, 0x0

    goto :goto_17

    .line 33
    :cond_15
    aget-object v5, p2, v2

    :goto_17
    new-instance v6, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    invoke-direct {v6, v3, v5, v4}, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;-><init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Lcom/fasterxml/jackson/annotation/JacksonInject$Value;)V

    aput-object v6, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 35
    :cond_21
    new-instance p2, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;

    invoke-direct {p2, p0, p1, v1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;-><init>(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;I)V

    return-object p2
.end method


# virtual methods
.method public final creator()Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;
    .registers 1

    .line 38
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_creator:Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;

    return-object p0
.end method

.method public final explicitParamName(I)Lcom/fasterxml/jackson/databind/PropertyName;
    .registers 2

    .line 53
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    aget-object p0, p0, p1

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->propDef:Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;

    if-eqz p0, :cond_13

    .line 55
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->isExplicitlyNamed()Z

    move-result p1

    if-eqz p1, :cond_13

    .line 56
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->getFullName()Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object p0

    return-object p0

    :cond_13
    const/4 p0, 0x0

    return-object p0
.end method

.method public final findImplicitParamName(I)Lcom/fasterxml/jackson/databind/PropertyName;
    .registers 3

    .line 63
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_intr:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    aget-object p0, p0, p1

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findImplicitPropertyName(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_19

    .line 64
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_19

    .line 65
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/PropertyName;->construct(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object p0

    return-object p0

    :cond_19
    const/4 p0, 0x0

    return-object p0
.end method

.method public final findOnlyParamWithoutInjection()I
    .registers 5

    const/4 v0, 0x0

    const/4 v1, -0x1

    move v2, v1

    .line 78
    :goto_3
    iget v3, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_paramCount:I

    if-ge v0, v3, :cond_16

    .line 79
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->injection:Lcom/fasterxml/jackson/annotation/JacksonInject$Value;

    if-nez v3, :cond_13

    if-ltz v2, :cond_12

    return v1

    :cond_12
    move v2, v0

    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_16
    return v2
.end method

.method public final injection(I)Lcom/fasterxml/jackson/annotation/JacksonInject$Value;
    .registers 2

    .line 40
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    aget-object p0, p0, p1

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->injection:Lcom/fasterxml/jackson/annotation/JacksonInject$Value;

    return-object p0
.end method

.method public final paramCount()I
    .registers 1

    .line 39
    iget p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_paramCount:I

    return p0
.end method

.method public final paramName(I)Lcom/fasterxml/jackson/databind/PropertyName;
    .registers 2

    .line 45
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    aget-object p0, p0, p1

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->propDef:Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;

    if-eqz p0, :cond_d

    .line 47
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->getFullName()Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method public final parameter(I)Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;
    .registers 2

    .line 41
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    aget-object p0, p0, p1

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;

    return-object p0
.end method

.method public final propertyDef(I)Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;
    .registers 2

    .line 42
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_params:[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;

    aget-object p0, p0, p1

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->propDef:Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 1

    .line 91
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;->_creator:Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param (com.fasterxml.jackson.databind.deser.impl.CreatorCandidate$Param)
.class public final Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Param"
.end annotation


# instance fields
.field public final annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;

.field public final injection:Lcom/fasterxml/jackson/annotation/JacksonInject$Value;

.field public final propDef:Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Lcom/fasterxml/jackson/annotation/JacksonInject$Value;)V
    .registers 4

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;

    .line 103
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->propDef:Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;

    .line 104
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;->injection:Lcom/fasterxml/jackson/annotation/JacksonInject$Value;

    return-void
.end method
