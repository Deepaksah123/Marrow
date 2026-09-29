###### Class com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy (com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy)
.class public Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;
.super Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;,
        Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;,
        Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$RecordNaming;
    }
.end annotation


# instance fields
.field protected final _baseNameValidator:Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;

.field protected final _config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _forClass:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

.field protected final _getterPrefix:Ljava/lang/String;

.field protected final _isGetterPrefix:Ljava/lang/String;

.field protected final _isGettersNonBoolean:Z

.field protected final _mutatorPrefix:Ljava/lang/String;

.field protected final _stdBeanNaming:Z


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;",
            ")V"
        }
    .end annotation

    .line 64
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    .line 66
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_forClass:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    .line 68
    sget-object p2, Lcom/fasterxml/jackson/databind/MapperFeature;->USE_STD_BEAN_NAMING:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_stdBeanNaming:Z

    .line 69
    sget-object p2, Lcom/fasterxml/jackson/databind/MapperFeature;->ALLOW_IS_GETTERS_FOR_NON_BOOLEAN:Lcom/fasterxml/jackson/databind/MapperFeature;

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isEnabled(Lcom/fasterxml/jackson/databind/MapperFeature;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isGettersNonBoolean:Z

    .line 70
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_mutatorPrefix:Ljava/lang/String;

    .line 71
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_getterPrefix:Ljava/lang/String;

    .line 72
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isGetterPrefix:Ljava/lang/String;

    .line 73
    iput-object p6, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_baseNameValidator:Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;

    return-void
.end method

.method private _booleanType(Lcom/fasterxml/jackson/databind/JavaType;)Z
    .registers 2

    .line 94
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/type/ResolvedType;->isReferenceType()Z

    move-result p0

    if-eqz p0, :cond_a

    .line 95
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getReferencedType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    .line 98
    :cond_a
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/JavaType;->hasRawClass(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_24

    .line 99
    const-class p0, Ljava/lang/Boolean;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/JavaType;->hasRawClass(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_24

    .line 100
    const-class p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/databind/JavaType;->hasRawClass(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_24

    const/4 p0, 0x0

    return p0

    :cond_24
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method protected _isCglibGetCallbacks(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Z
    .registers 3

    .line 245
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object p0

    .line 247
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_36

    .line 252
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    .line 254
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 255
    const-string p1, ".cglib"

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_36

    .line 256
    const-string p1, "net.sf.cglib"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_34

    .line 258
    const-string p1, "org.hibernate.repackage.cglib"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_34

    .line 260
    const-string p1, "org.springframework.cglib"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_34

    return v0

    :cond_34
    const/4 p0, 0x1

    return p0

    :cond_36
    return v0
.end method

.method protected _isGroovyMetaClassGetter(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Z
    .registers 2

    .line 268
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "groovy.lang"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public findNameForIsGetter(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 79
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isGetterPrefix:Ljava/lang/String;

    if-eqz v0, :cond_34

    .line 80
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isGettersNonBoolean:Z

    if-nez v0, :cond_12

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_booleanType(Lcom/fasterxml/jackson/databind/JavaType;)Z

    move-result p1

    if-eqz p1, :cond_34

    .line 81
    :cond_12
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isGetterPrefix:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_34

    .line 82
    iget-boolean p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_stdBeanNaming:Z

    if-eqz p1, :cond_29

    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isGetterPrefix:Ljava/lang/String;

    .line 83
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->stdManglePropertyName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_29
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isGetterPrefix:Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->legacyManglePropertyName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_34
    const/4 p0, 0x0

    return-object p0
.end method

.method public findNameForMutator(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 134
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_mutatorPrefix:Ljava/lang/String;

    if-eqz p1, :cond_24

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_24

    .line 135
    iget-boolean p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_stdBeanNaming:Z

    if-eqz p1, :cond_19

    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_mutatorPrefix:Ljava/lang/String;

    .line 136
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->stdManglePropertyName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_19
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_mutatorPrefix:Ljava/lang/String;

    .line 137
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->legacyManglePropertyName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_24
    const/4 p0, 0x0

    return-object p0
.end method

.method public findNameForRegularGetter(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    .line 109
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_getterPrefix:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_43

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_43

    .line 114
    const-string v0, "getCallbacks"

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 115
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isCglibGetCallbacks(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Z

    move-result p1

    if-eqz p1, :cond_29

    return-object v1

    .line 118
    :cond_1a
    const-string v0, "getMetaClass"

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    .line 120
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_isGroovyMetaClassGetter(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Z

    move-result p1

    if-eqz p1, :cond_29

    return-object v1

    .line 124
    :cond_29
    iget-boolean p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_stdBeanNaming:Z

    if-eqz p1, :cond_38

    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_getterPrefix:Ljava/lang/String;

    .line 125
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->stdManglePropertyName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_38
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_getterPrefix:Ljava/lang/String;

    .line 126
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->legacyManglePropertyName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_43
    return-object v1
.end method

.method protected legacyManglePropertyName(Ljava/lang/String;I)Ljava/lang/String;
    .registers 6

    .line 163
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v0, p2, :cond_8

    return-object v1

    .line 167
    :cond_8
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 170
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_baseNameValidator:Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;

    if-eqz p0, :cond_17

    .line 171
    invoke-interface {p0, v2, p1, p2}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;->accept(CLjava/lang/String;I)Z

    move-result p0

    if-nez p0, :cond_17

    return-object v1

    .line 177
    :cond_17
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    if-ne v2, p0, :cond_22

    .line 180
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 183
    :cond_22
    new-instance v1, Ljava/lang/StringBuilder;

    sub-int v2, v0, p2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 184
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2c
    add-int/lit8 p2, p2, 0x1

    if-ge p2, v0, :cond_42

    .line 187
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    .line 188
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    if-ne p0, v2, :cond_3e

    .line 190
    invoke-virtual {v1, p1, p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_42

    .line 193
    :cond_3e
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2c

    .line 195
    :cond_42
    :goto_42
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public modifyFieldName(Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    return-object p2
.end method

.method protected stdManglePropertyName(Ljava/lang/String;I)Ljava/lang/String;
    .registers 6

    .line 200
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v0, p2, :cond_8

    return-object v1

    .line 205
    :cond_8
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 208
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->_baseNameValidator:Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;

    if-eqz p0, :cond_17

    .line 209
    invoke-interface {p0, v2, p1, p2}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;->accept(CLjava/lang/String;I)Z

    move-result p0

    if-nez p0, :cond_17

    return-object v1

    .line 214
    :cond_17
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    if-ne v2, p0, :cond_22

    .line 216
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_22
    add-int/lit8 v1, p2, 0x1

    if-ge v1, v0, :cond_35

    .line 222
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v2

    if-eqz v2, :cond_35

    .line 223
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 226
    :cond_35
    new-instance v2, Ljava/lang/StringBuilder;

    sub-int p2, v0, p2

    invoke-direct {v2, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 227
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 228
    invoke-virtual {v2, p1, v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 229
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.BaseNameValidator (com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$BaseNameValidator)
.class public interface abstract Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "BaseNameValidator"
.end annotation


# virtual methods
.method public abstract accept(CLjava/lang/String;I)Z
.end method

###### Class com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.Provider (com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$Provider)
.class public Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;
.super Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy$Provider;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Provider"
.end annotation


# instance fields
.field protected final _baseNameValidator:Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;

.field protected final _getterPrefix:Ljava/lang/String;

.field protected final _isGetterPrefix:Ljava/lang/String;

.field protected final _setterPrefix:Ljava/lang/String;

.field protected final _withPrefix:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 7

    .line 310
    const-string v1, "set"

    const-string v2, "with"

    const-string v3, "get"

    const-string v4, "is"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;)V
    .registers 6

    .line 331
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy$Provider;-><init>()V

    .line 332
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_setterPrefix:Ljava/lang/String;

    .line 333
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_withPrefix:Ljava/lang/String;

    .line 334
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_getterPrefix:Ljava/lang/String;

    .line 335
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_isGetterPrefix:Ljava/lang/String;

    .line 336
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_baseNameValidator:Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;

    return-void
.end method


# virtual methods
.method public forBuilder(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;"
        }
    .end annotation

    .line 461
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->isAnnotationProcessingEnabled()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_c

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/cfg/MapperConfig;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object p3

    goto :goto_d

    :cond_c
    move-object p3, v0

    :goto_d
    if-nez p3, :cond_10

    goto :goto_14

    .line 462
    :cond_10
    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findPOJOBuilderConfig(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/annotation/JsonPOJOBuilder$Value;

    move-result-object v0

    :goto_14
    if-nez v0, :cond_19

    .line 463
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_withPrefix:Ljava/lang/String;

    goto :goto_1b

    :cond_19
    iget-object p3, v0, Lcom/fasterxml/jackson/databind/annotation/JsonPOJOBuilder$Value;->withPrefix:Ljava/lang/String;

    :goto_1b
    move-object v3, p3

    .line 464
    new-instance p3, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_getterPrefix:Ljava/lang/String;

    iget-object v5, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_isGetterPrefix:Ljava/lang/String;

    iget-object v6, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_baseNameValidator:Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;

    move-object v0, p3

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;-><init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;)V

    return-object p3
.end method

.method public forPOJO(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;"
        }
    .end annotation

    .line 452
    new-instance v7, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_setterPrefix:Ljava/lang/String;

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_getterPrefix:Ljava/lang/String;

    iget-object v5, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_isGetterPrefix:Ljava/lang/String;

    iget-object v6, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$Provider;->_baseNameValidator:Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;-><init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;)V

    return-object v7
.end method

.method public forRecord(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")",
            "Lcom/fasterxml/jackson/databind/introspect/AccessorNamingStrategy;"
        }
    .end annotation

    .line 472
    new-instance p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$RecordNaming;

    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$RecordNaming;-><init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)V

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.RecordNaming (com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$RecordNaming)
.class public Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$RecordNaming;
.super Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RecordNaming"
.end annotation


# instance fields
.field protected final _fieldNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            ")V"
        }
    .end annotation

    const/4 v3, 0x0

    .line 548
    const-string v4, "get"

    const-string v5, "is"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;-><init>(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$BaseNameValidator;)V

    .line 554
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util;->getRecordFieldNames(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1b

    .line 557
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p1

    goto :goto_25

    .line 558
    :cond_1b
    new-instance p2, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object p1, p2

    :goto_25
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$RecordNaming;->_fieldNames:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public findNameForRegularGetter(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 567
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy$RecordNaming;->_fieldNames:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-object p2

    .line 571
    :cond_9
    invoke-super {p0, p1, p2}, Lcom/fasterxml/jackson/databind/introspect/DefaultAccessorNamingStrategy;->findNameForRegularGetter(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
