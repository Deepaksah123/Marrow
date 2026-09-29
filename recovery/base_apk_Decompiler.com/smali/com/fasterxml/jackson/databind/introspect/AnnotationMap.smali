###### Class com.fasterxml.jackson.databind.introspect.AnnotationMap (com.fasterxml.jackson.databind.introspect.AnnotationMap)
.class public final Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/util/Annotations;


# instance fields
.field protected _annotations:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/util/HashMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    return-void
.end method

.method public static merge(Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;
    .registers 5

    if-eqz p0, :cond_60

    .line 91
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    if-eqz v0, :cond_60

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_60

    if-eqz p1, :cond_5f

    .line 94
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    if-eqz v0, :cond_5f

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_19

    goto :goto_5f

    .line 97
    :cond_19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 99
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_28
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/annotation/Annotation;

    .line 100
    invoke-interface {v1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_28

    .line 103
    :cond_3c
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_46
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 104
    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_46

    .line 106
    :cond_5a
    new-instance p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;-><init>(Ljava/util/HashMap;)V

    :cond_5f
    :goto_5f
    return-object p0

    :cond_60
    return-object p1
.end method

.method public static of(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;"
        }
    .end annotation

    .line 21
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 22
    invoke-virtual {v0, p0, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    new-instance p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;-><init>(Ljava/util/HashMap;)V

    return-object p0
.end method


# virtual methods
.method protected final _add(Ljava/lang/annotation/Annotation;)Z
    .registers 3

    .line 152
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    if-nez v0, :cond_b

    .line 153
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    .line 155
    :cond_b
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/annotation/Annotation;

    if-eqz p0, :cond_21

    .line 156
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_21

    const/4 p0, 0x0

    return p0

    :cond_21
    const/4 p0, 0x1

    return p0
.end method

.method public final add(Ljava/lang/annotation/Annotation;)Z
    .registers 2

    .line 134
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_add(Ljava/lang/annotation/Annotation;)Z

    move-result p0

    return p0
.end method

.method public final get(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TA;>;)TA;"
        }
    .end annotation

    .line 40
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 43
    :cond_6
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/annotation/Annotation;

    return-object p0
.end method

.method public final has(Ljava/lang/Class;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 49
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 52
    :cond_6
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final hasOneOf([Ljava/lang/Class;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_18

    .line 64
    array-length v0, p1

    move v2, v1

    :goto_7
    if-ge v2, v0, :cond_18

    .line 65
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    aget-object v4, p1, v2

    invoke-virtual {v3, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_15
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_18
    return v1
.end method

.method public final size()I
    .registers 1

    .line 111
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result p0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 1

    .line 139
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->_annotations:Ljava/util/HashMap;

    if-nez p0, :cond_7

    .line 140
    const-string p0, "[null]"

    return-object p0

    .line 142
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
