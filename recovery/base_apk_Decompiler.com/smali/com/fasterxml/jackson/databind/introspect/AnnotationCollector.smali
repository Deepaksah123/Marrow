###### Class com.fasterxml.jackson.databind.introspect.AnnotationCollector (com.fasterxml.jackson.databind.introspect.AnnotationCollector)
.class public abstract Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;,
        Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;,
        Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NoAnnotations;,
        Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;,
        Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;,
        Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;
    }
.end annotation


# static fields
.field protected static final NO_ANNOTATIONS:Lcom/fasterxml/jackson/databind/util/Annotations;


# instance fields
.field protected final _data:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 18
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NoAnnotations;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NoAnnotations;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;->NO_ANNOTATIONS:Lcom/fasterxml/jackson/databind/util/Annotations;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;)V
    .registers 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;->_data:Ljava/lang/Object;

    return-void
.end method

.method public static emptyAnnotations()Lcom/fasterxml/jackson/databind/util/Annotations;
    .registers 1

    .line 29
    sget-object v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;->NO_ANNOTATIONS:Lcom/fasterxml/jackson/databind/util/Annotations;

    return-object v0
.end method

.method public static emptyCollector()Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
    .registers 1

    .line 32
    sget-object v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;->instance:Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;

    return-object v0
.end method


# virtual methods
.method public abstract addOrOverride(Ljava/lang/annotation/Annotation;)Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.end method

.method public abstract asAnnotationMap()Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;
.end method

.method public abstract asAnnotations()Lcom/fasterxml/jackson/databind/util/Annotations;
.end method

.method public abstract isPresent(Ljava/lang/annotation/Annotation;)Z
.end method

###### Class com.fasterxml.jackson.databind.introspect.AnnotationCollector.EmptyCollector (com.fasterxml.jackson.databind.introspect.AnnotationCollector$EmptyCollector)
.class Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;
.super Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "EmptyCollector"
.end annotation


# static fields
.field public static final instance:Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 64
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;->instance:Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .registers 2

    .line 66
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public addOrOverride(Ljava/lang/annotation/Annotation;)Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
    .registers 4

    .line 83
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;->_data:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public asAnnotationMap()Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;
    .registers 1

    .line 75
    new-instance p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;-><init>()V

    return-object p0
.end method

.method public asAnnotations()Lcom/fasterxml/jackson/databind/util/Annotations;
    .registers 1

    .line 70
    sget-object p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;->NO_ANNOTATIONS:Lcom/fasterxml/jackson/databind/util/Annotations;

    return-object p0
.end method

.method public isPresent(Ljava/lang/annotation/Annotation;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

###### Class com.fasterxml.jackson.databind.introspect.AnnotationCollector.NCollector (com.fasterxml.jackson.databind.introspect.AnnotationCollector$NCollector)
.class Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;
.super Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "NCollector"
.end annotation


# instance fields
.field protected final _annotations:Ljava/util/HashMap;
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
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/annotation/Annotation;Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    .line 133
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;-><init>(Ljava/lang/Object;)V

    .line 134
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;->_annotations:Ljava/util/HashMap;

    .line 135
    invoke-virtual {p1, p2, p3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    invoke-virtual {p1, p4, p5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public addOrOverride(Ljava/lang/annotation/Annotation;)Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
    .registers 4

    .line 166
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;->_annotations:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public asAnnotationMap()Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;
    .registers 3

    .line 152
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;-><init>()V

    .line 153
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;->_annotations:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/annotation/Annotation;

    .line 154
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->add(Ljava/lang/annotation/Annotation;)Z

    goto :goto_f

    :cond_1f
    return-object v0
.end method

.method public asAnnotations()Lcom/fasterxml/jackson/databind/util/Annotations;
    .registers 5

    .line 141
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;->_annotations:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3d

    .line 142
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;->_annotations:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 143
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    .line 144
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Annotation;

    .line 145
    new-instance v2, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/annotation/Annotation;

    invoke-direct {v2, v1, v0, v3, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;-><init>(Ljava/lang/Class;Ljava/lang/annotation/Annotation;Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V

    return-object v2

    .line 147
    :cond_3d
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;->_annotations:Ljava/util/HashMap;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;-><init>(Ljava/util/HashMap;)V

    return-object v0
.end method

.method public isPresent(Ljava/lang/annotation/Annotation;)Z
    .registers 2

    .line 161
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;->_annotations:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

###### Class com.fasterxml.jackson.databind.introspect.AnnotationCollector.NoAnnotations (com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations)
.class public Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NoAnnotations;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/util/Annotations;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NoAnnotations"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
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

    const/4 p0, 0x0

    return-object p0
.end method

.method public has(Ljava/lang/Class;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public hasOneOf([Ljava/lang/Class;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public size()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

###### Class com.fasterxml.jackson.databind.introspect.AnnotationCollector.OneAnnotation (com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation)
.class public Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/util/Annotations;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OneAnnotation"
.end annotation


# instance fields
.field private final _type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final _value:Ljava/lang/annotation/Annotation;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 220
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;->_type:Ljava/lang/Class;

    .line 221
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;->_value:Ljava/lang/annotation/Annotation;

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TA;>;)TA;"
        }
    .end annotation

    .line 227
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;->_type:Ljava/lang/Class;

    if-ne v0, p1, :cond_7

    .line 228
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;->_value:Ljava/lang/annotation/Annotation;

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public has(Ljava/lang/Class;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 235
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;->_type:Ljava/lang/Class;

    if-ne p0, p1, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public hasOneOf([Ljava/lang/Class;)Z
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

    .line 240
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_3
    if-ge v2, v0, :cond_10

    aget-object v3, p1, v2

    .line 241
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;->_type:Ljava/lang/Class;

    if-ne v3, v4, :cond_d

    const/4 p0, 0x1

    return p0

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_10
    return v1
.end method

.method public size()I
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

###### Class com.fasterxml.jackson.databind.introspect.AnnotationCollector.OneCollector (com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneCollector)
.class Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;
.super Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OneCollector"
.end annotation


# instance fields
.field private _type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private _value:Ljava/lang/annotation/Annotation;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    .line 94
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;-><init>(Ljava/lang/Object;)V

    .line 95
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_type:Ljava/lang/Class;

    .line 96
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_value:Ljava/lang/annotation/Annotation;

    return-void
.end method


# virtual methods
.method public addOrOverride(Ljava/lang/annotation/Annotation;)Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
    .registers 9

    .line 116
    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v4

    .line 118
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_type:Ljava/lang/Class;

    if-ne v0, v4, :cond_b

    .line 119
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_value:Ljava/lang/annotation/Annotation;

    return-object p0

    .line 122
    :cond_b
    new-instance v6, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;->_data:Ljava/lang/Object;

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_type:Ljava/lang/Class;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_value:Ljava/lang/annotation/Annotation;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/annotation/Annotation;Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V

    return-object v6
.end method

.method public asAnnotationMap()Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;
    .registers 2

    .line 106
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_type:Ljava/lang/Class;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_value:Ljava/lang/annotation/Annotation;

    invoke-static {v0, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;->of(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;

    move-result-object p0

    return-object p0
.end method

.method public asAnnotations()Lcom/fasterxml/jackson/databind/util/Annotations;
    .registers 3

    .line 101
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_type:Ljava/lang/Class;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_value:Ljava/lang/annotation/Annotation;

    invoke-direct {v0, v1, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation;-><init>(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public isPresent(Ljava/lang/annotation/Annotation;)Z
    .registers 2

    .line 111
    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object p1

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector;->_type:Ljava/lang/Class;

    if-ne p1, p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

###### Class com.fasterxml.jackson.databind.introspect.AnnotationCollector.TwoAnnotations (com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations)
.class public Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/util/Annotations;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TwoAnnotations"
.end annotation


# instance fields
.field private final _type1:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final _type2:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final _value1:Ljava/lang/annotation/Annotation;

.field private final _value2:Ljava/lang/annotation/Annotation;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/annotation/Annotation;Ljava/lang/Class;Ljava/lang/annotation/Annotation;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 264
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_type1:Ljava/lang/Class;

    .line 265
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_value1:Ljava/lang/annotation/Annotation;

    .line 266
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_type2:Ljava/lang/Class;

    .line 267
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_value2:Ljava/lang/annotation/Annotation;

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TA;>;)TA;"
        }
    .end annotation

    .line 273
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_type1:Ljava/lang/Class;

    if-ne v0, p1, :cond_7

    .line 274
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_value1:Ljava/lang/annotation/Annotation;

    return-object p0

    .line 276
    :cond_7
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_type2:Ljava/lang/Class;

    if-ne v0, p1, :cond_e

    .line 277
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_value2:Ljava/lang/annotation/Annotation;

    return-object p0

    :cond_e
    const/4 p0, 0x0

    return-object p0
.end method

.method public has(Ljava/lang/Class;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 284
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_type1:Ljava/lang/Class;

    if-eq v0, p1, :cond_a

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_type2:Ljava/lang/Class;

    if-eq p0, p1, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    const/4 p0, 0x1

    return p0
.end method

.method public hasOneOf([Ljava/lang/Class;)Z
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

    .line 289
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_3
    if-ge v2, v0, :cond_14

    aget-object v3, p1, v2

    .line 290
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_type1:Ljava/lang/Class;

    if-eq v3, v4, :cond_12

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations;->_type2:Ljava/lang/Class;

    if-eq v3, v4, :cond_12

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_12
    const/4 p0, 0x1

    return p0

    :cond_14
    return v1
.end method

.method public size()I
    .registers 1

    const/4 p0, 0x2

    return p0
.end method
