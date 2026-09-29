###### Class com.fasterxml.jackson.databind.cfg.DatatypeFeatures (com.fasterxml.jackson.databind.cfg.DatatypeFeatures)
.class public Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures$DefaultHolder;
    }
.end annotation


# instance fields
.field private final _enabledFor1:I

.field private final _enabledFor2:I

.field private final _explicitFor1:I

.field private final _explicitFor2:I


# direct methods
.method protected constructor <init>(IIII)V
    .registers 5

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->_enabledFor1:I

    .line 27
    iput p2, p0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->_explicitFor1:I

    .line 28
    iput p3, p0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->_enabledFor2:I

    .line 29
    iput p4, p0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->_explicitFor2:I

    return-void
.end method

.method public static defaultFeatures()Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;
    .registers 1

    .line 33
    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures$DefaultHolder;->getDefault()Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public isEnabled(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;)Z
    .registers 4

    .line 179
    invoke-interface {p1}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;->featureIndex()I

    move-result v0

    if-eqz v0, :cond_15

    const/4 v1, 0x1

    if-eq v0, v1, :cond_e

    .line 185
    invoke-static {}, Lcom/fasterxml/jackson/core/util/VersionUtil;->throwInternal()V

    const/4 p0, 0x0

    return p0

    .line 183
    :cond_e
    iget p0, p0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->_enabledFor2:I

    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;->enabledIn(I)Z

    move-result p0

    return p0

    .line 181
    :cond_15
    iget p0, p0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->_enabledFor1:I

    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;->enabledIn(I)Z

    move-result p0

    return p0
.end method

.method public isExplicitlySet(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;)Z
    .registers 4

    .line 200
    invoke-interface {p1}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;->featureIndex()I

    move-result v0

    if-eqz v0, :cond_15

    const/4 v1, 0x1

    if-eq v0, v1, :cond_e

    .line 206
    invoke-static {}, Lcom/fasterxml/jackson/core/util/VersionUtil;->throwInternal()V

    const/4 p0, 0x0

    return p0

    .line 204
    :cond_e
    iget p0, p0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->_explicitFor2:I

    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;->enabledIn(I)Z

    move-result p0

    return p0

    .line 202
    :cond_15
    iget p0, p0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;->_explicitFor1:I

    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeature;->enabledIn(I)Z

    move-result p0

    return p0
.end method

###### Class com.fasterxml.jackson.databind.cfg.DatatypeFeatures.DefaultHolder (com.fasterxml.jackson.databind.cfg.DatatypeFeatures$DefaultHolder)
.class Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures$DefaultHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "DefaultHolder"
.end annotation


# static fields
.field private static final DEFAULT_FEATURES:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    .line 302
    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/EnumFeature;->values()[Lcom/fasterxml/jackson/databind/cfg/EnumFeature;

    move-result-object v0

    invoke-static {v0}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures$DefaultHolder;->collectDefaults([Ljava/lang/Enum;)I

    move-result v0

    .line 303
    new-instance v1, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    invoke-static {}, Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;->values()[Lcom/fasterxml/jackson/databind/cfg/JsonNodeFeature;

    move-result-object v2

    invoke-static {v2}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures$DefaultHolder;->collectDefaults([Ljava/lang/Enum;)I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2, v3}, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;-><init>(IIII)V

    sput-object v1, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures$DefaultHolder;->DEFAULT_FEATURES:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    return-void
.end method

.method private static collectDefaults([Ljava/lang/Enum;)I
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Enum<",
            "TF;>;:",
            "Lcom/fasterxml/jackson/core/util/JacksonFeature;",
            ">([TF;)I"
        }
    .end annotation

    .line 310
    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_3
    if-ge v1, v0, :cond_15

    aget-object v3, p0, v1

    .line 311
    invoke-interface {v3}, Lcom/fasterxml/jackson/core/util/JacksonFeature;->enabledByDefault()Z

    move-result v4

    if-eqz v4, :cond_12

    .line 312
    invoke-interface {v3}, Lcom/fasterxml/jackson/core/util/JacksonFeature;->getMask()I

    move-result v3

    or-int/2addr v2, v3

    :cond_12
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_15
    return v2
.end method

.method public static getDefault()Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;
    .registers 1

    .line 319
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures$DefaultHolder;->DEFAULT_FEATURES:Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;

    return-object v0
.end method
