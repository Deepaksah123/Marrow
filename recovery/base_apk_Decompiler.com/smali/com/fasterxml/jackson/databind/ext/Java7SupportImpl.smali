###### Class com.fasterxml.jackson.databind.ext.Java7SupportImpl (com.fasterxml.jackson.databind.ext.Java7SupportImpl)
.class public Lcom/fasterxml/jackson/databind/ext/Java7SupportImpl;
.super Lcom/fasterxml/jackson/databind/ext/Java7Support;
.source "SourceFile"


# instance fields
.field private final _bogus:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 19
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/ext/Java7Support;-><init>()V

    .line 24
    const-class v0, Ljava/beans/ConstructorProperties;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ext/Java7SupportImpl;->_bogus:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public findConstructorName(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;)Lcom/fasterxml/jackson/databind/PropertyName;
    .registers 3

    .line 50
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;->getOwner()Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;

    move-result-object p0

    if-eqz p0, :cond_22

    .line 52
    const-class v0, Ljava/beans/ConstructorProperties;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Ljava/beans/ConstructorProperties;

    if-eqz p0, :cond_22

    .line 54
    invoke-interface {p0}, Ljava/beans/ConstructorProperties;->value()[Ljava/lang/String;

    move-result-object p0

    .line 55
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;->getIndex()I

    move-result p1

    .line 56
    array-length v0, p0

    if-ge p1, v0, :cond_22

    .line 57
    aget-object p0, p0, p1

    invoke-static {p0}, Lcom/fasterxml/jackson/databind/PropertyName;->construct(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object p0

    return-object p0

    :cond_22
    const/4 p0, 0x0

    return-object p0
.end method

.method public findTransient(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Boolean;
    .registers 2

    .line 29
    const-class p0, Ljava/beans/Transient;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Ljava/beans/Transient;

    if-eqz p0, :cond_13

    .line 31
    invoke-interface {p0}, Ljava/beans/Transient;->value()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_13
    const/4 p0, 0x0

    return-object p0
.end method

.method public hasCreatorAnnotation(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Boolean;
    .registers 2

    .line 38
    const-class p0, Ljava/beans/ConstructorProperties;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Ljava/beans/ConstructorProperties;

    if-eqz p0, :cond_d

    .line 42
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method
