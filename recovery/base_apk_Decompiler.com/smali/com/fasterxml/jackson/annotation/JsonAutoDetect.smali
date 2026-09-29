###### Class com.fasterxml.jackson.annotation.JsonAutoDetect (com.fasterxml.jackson.annotation.JsonAutoDetect)
.class public interface abstract annotation Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
        creatorVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
        fieldVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
        getterVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
        isGetterVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
        setterVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;,
        Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract creatorVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end method

.method public abstract fieldVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end method

.method public abstract getterVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end method

.method public abstract isGetterVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end method

.method public abstract setterVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end method

###### Class com.fasterxml.jackson.annotation.JsonAutoDetect.AnonymousClass1 (com.fasterxml.jackson.annotation.JsonAutoDetect$1)
.class synthetic Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility:[I

.field static final synthetic $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor:[I


# direct methods
.method static constructor <clinit>()V
    .registers 8

    .line 206
    invoke-static {}, Lcom/fasterxml/jackson/annotation/PropertyAccessor;->values()[Lcom/fasterxml/jackson/annotation/PropertyAccessor;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor:[I

    const/4 v1, 0x1

    :try_start_a
    sget-object v2, Lcom/fasterxml/jackson/annotation/PropertyAccessor;->CREATOR:Lcom/fasterxml/jackson/annotation/PropertyAccessor;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_12} :catch_12

    :catch_12
    const/4 v0, 0x2

    :try_start_13
    sget-object v2, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor:[I

    sget-object v3, Lcom/fasterxml/jackson/annotation/PropertyAccessor;->FIELD:Lcom/fasterxml/jackson/annotation/PropertyAccessor;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_1d} :catch_1d

    :catch_1d
    const/4 v2, 0x3

    :try_start_1e
    sget-object v3, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor:[I

    sget-object v4, Lcom/fasterxml/jackson/annotation/PropertyAccessor;->GETTER:Lcom/fasterxml/jackson/annotation/PropertyAccessor;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v3, v4
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_28} :catch_28

    :catch_28
    const/4 v3, 0x4

    :try_start_29
    sget-object v4, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor:[I

    sget-object v5, Lcom/fasterxml/jackson/annotation/PropertyAccessor;->IS_GETTER:Lcom/fasterxml/jackson/annotation/PropertyAccessor;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v3, v4, v5
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_29 .. :try_end_33} :catch_33

    :catch_33
    const/4 v4, 0x5

    :try_start_34
    sget-object v5, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor:[I

    sget-object v6, Lcom/fasterxml/jackson/annotation/PropertyAccessor;->NONE:Lcom/fasterxml/jackson/annotation/PropertyAccessor;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aput v4, v5, v6
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_34 .. :try_end_3e} :catch_3e

    :catch_3e
    :try_start_3e
    sget-object v5, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor:[I

    sget-object v6, Lcom/fasterxml/jackson/annotation/PropertyAccessor;->SETTER:Lcom/fasterxml/jackson/annotation/PropertyAccessor;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v7, 0x6

    aput v7, v5, v6
    :try_end_49
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3e .. :try_end_49} :catch_49

    :catch_49
    :try_start_49
    sget-object v5, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor:[I

    sget-object v6, Lcom/fasterxml/jackson/annotation/PropertyAccessor;->ALL:Lcom/fasterxml/jackson/annotation/PropertyAccessor;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v7, 0x7

    aput v7, v5, v6
    :try_end_54
    .catch Ljava/lang/NoSuchFieldError; {:try_start_49 .. :try_end_54} :catch_54

    .line 75
    :catch_54
    invoke-static {}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->values()[Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    move-result-object v5

    array-length v5, v5

    new-array v5, v5, [I

    sput-object v5, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility:[I

    :try_start_5d
    sget-object v6, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->ANY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aput v1, v5, v6
    :try_end_65
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5d .. :try_end_65} :catch_65

    :catch_65
    :try_start_65
    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility:[I

    sget-object v5, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v0, v1, v5
    :try_end_6f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_65 .. :try_end_6f} :catch_6f

    :catch_6f
    :try_start_6f
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility:[I

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NON_PRIVATE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_79
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6f .. :try_end_79} :catch_79

    :catch_79
    :try_start_79
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility:[I

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->PROTECTED_AND_PUBLIC:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_83
    .catch Ljava/lang/NoSuchFieldError; {:try_start_79 .. :try_end_83} :catch_83

    :catch_83
    :try_start_83
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility:[I

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->PUBLIC_ONLY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1
    :try_end_8d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_83 .. :try_end_8d} :catch_8d

    :catch_8d
    return-void
.end method

###### Class com.fasterxml.jackson.annotation.JsonAutoDetect.Value (com.fasterxml.jackson.annotation.JsonAutoDetect$Value)
.class public Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Value"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field protected static final DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

.field private static final DEFAULT_FIELD_VISIBILITY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field protected static final NO_OVERRIDES:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;


# instance fields
.field protected final _creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field protected final _fieldVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field protected final _getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field protected final _isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field protected final _setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;


# direct methods
.method static constructor <clinit>()V
    .registers 13

    .line 141
    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->PUBLIC_ONLY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    sput-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->DEFAULT_FIELD_VISIBILITY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 152
    new-instance v6, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    sget-object v3, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->PUBLIC_ONLY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    sget-object v4, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->ANY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    sget-object v5, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->PUBLIC_ONLY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    move-object v0, v6

    move-object v2, v3

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)V

    sput-object v6, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    .line 160
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    sget-object v9, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    sget-object v11, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    sget-object v12, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    move-object v7, v0

    move-object v8, v9

    move-object v10, v11

    invoke-direct/range {v7 .. v12}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;-><init>(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)V

    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->NO_OVERRIDES:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    return-void
.end method

.method private constructor <init>(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)V
    .registers 6

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    iput-object p1, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_fieldVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 174
    iput-object p2, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 175
    iput-object p3, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 176
    iput-object p4, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 177
    iput-object p5, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-void
.end method

.method private static _equals(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;)Z
    .registers 4

    .line 370
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_fieldVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v1, p1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_fieldVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne v0, v1, :cond_20

    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v1, p1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne v0, v1, :cond_20

    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v1, p1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne v0, v1, :cond_20

    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v1, p1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne v0, v1, :cond_20

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object p1, p1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p0, p1, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_20
    const/4 p0, 0x0

    return p0
.end method

.method private static _predefined(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;
    .registers 6

    .line 350
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->DEFAULT_FIELD_VISIBILITY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p0, v0, :cond_17

    .line 351
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p1, v0, :cond_2e

    iget-object p1, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p2, p1, :cond_2e

    iget-object p1, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p3, p1, :cond_2e

    iget-object p1, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p4, p1, :cond_2e

    return-object p0

    .line 357
    :cond_17
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p0, v0, :cond_2e

    .line 358
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p1, p0, :cond_2e

    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p2, p0, :cond_2e

    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p3, p0, :cond_2e

    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    if-ne p4, p0, :cond_2e

    .line 362
    sget-object p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->NO_OVERRIDES:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    return-object p0

    :cond_2e
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-nez p1, :cond_8

    return v1

    .line 343
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_1b

    check-cast p1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    invoke-static {p0, p1}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_equals(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;)Z

    move-result p0

    if-eqz p0, :cond_1b

    return v0

    :cond_1b
    return v1
.end method

.method public getCreatorVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    .registers 1

    .line 312
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-object p0
.end method

.method public getFieldVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    .registers 1

    .line 308
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_fieldVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-object p0
.end method

.method public getGetterVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    .registers 1

    .line 309
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-object p0
.end method

.method public getIsGetterVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    .registers 1

    .line 310
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-object p0
.end method

.method public getSetterVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    .registers 1

    .line 311
    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-object p0
.end method

.method public hashCode()I
    .registers 5

    .line 331
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_fieldVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 332
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    iget-object v2, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 333
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    iget-object v3, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 334
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 335
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    mul-int/lit8 p0, p0, 0xd

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v1, v1, 0x3

    mul-int/lit8 v2, v2, 0x7

    sub-int/2addr v1, v2

    mul-int/lit8 v3, v3, 0xb

    add-int/2addr v1, v3

    xor-int/2addr v0, v1

    xor-int/2addr p0, v0

    return p0
.end method

.method protected readResolve()Ljava/lang/Object;
    .registers 6

    .line 316
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_fieldVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v2, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v3, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v4, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_predefined(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    move-result-object v0

    if-nez v0, :cond_11

    return-object p0

    :cond_11
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    .line 323
    iget-object v0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_fieldVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v1, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_getterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v2, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_isGetterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object v3, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_setterVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    iget-object p0, p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;->_creatorVisibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility (com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)
.class public final enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Visibility"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field public static final enum ANY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field public static final enum DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field public static final enum NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field public static final enum NON_PRIVATE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field public static final enum PROTECTED_AND_PUBLIC:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

.field public static final enum PUBLIC_ONLY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;


# direct methods
.method static constructor <clinit>()V
    .registers 8

    .line 43
    new-instance v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    const-string v1, "ANY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->ANY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 48
    new-instance v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    const-string v2, "NON_PRIVATE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NON_PRIVATE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 54
    new-instance v2, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    const-string v3, "PROTECTED_AND_PUBLIC"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->PROTECTED_AND_PUBLIC:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 59
    new-instance v3, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    const-string v4, "PUBLIC_ONLY"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->PUBLIC_ONLY:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 65
    new-instance v4, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    const-string v5, "NONE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 72
    new-instance v5, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    const-string v6, "DEFAULT"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->DEFAULT:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    .line 38
    filled-new-array/range {v0 .. v5}, [Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->$VALUES:[Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    .registers 2

    .line 38
    const-class v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
    .registers 1

    .line 38
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->$VALUES:[Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;

    return-object v0
.end method


# virtual methods
.method public final isVisible(Ljava/lang/reflect/Member;)Z
    .registers 4

    .line 75
    sget-object v0, Lcom/fasterxml/jackson/annotation/JsonAutoDetect$1;->$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_34

    const/4 v1, 0x3

    if-eq p0, v1, :cond_2a

    const/4 v1, 0x4

    if-eq p0, v1, :cond_16

    const/4 v0, 0x5

    if-eq p0, v0, :cond_21

    const/4 p0, 0x0

    return p0

    .line 83
    :cond_16
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result p0

    if-eqz p0, :cond_21

    return v0

    .line 88
    :cond_21
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result p0

    return p0

    .line 81
    :cond_2a
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result p0

    xor-int/2addr p0, v0

    return p0

    :cond_34
    return v0
.end method
