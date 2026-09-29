###### Class com.fasterxml.jackson.databind.cfg.ConfigOverride (com.fasterxml.jackson.databind.cfg.ConfigOverride)
.class public abstract Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;
    }
.end annotation


# instance fields
.field protected _format:Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

.field protected _ignorals:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

.field protected _include:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

.field protected _includeAsProperty:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

.field protected _isIgnoredType:Ljava/lang/Boolean;

.field protected _mergeable:Ljava/lang/Boolean;

.field protected _setterInfo:Lcom/fasterxml/jackson/annotation/JsonSetter$Value;

.field protected _visibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;


# direct methods
.method protected constructor <init>()V
    .registers 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static empty()Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;
    .registers 1

    .line 94
    sget-object v0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;->INSTANCE:Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;

    return-object v0
.end method


# virtual methods
.method public getFormat()Lcom/fasterxml/jackson/annotation/JsonFormat$Value;
    .registers 1

    .line 97
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->_format:Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    return-object p0
.end method

.method public getIgnorals()Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;
    .registers 1

    .line 105
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->_ignorals:Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;

    return-object p0
.end method

.method public getInclude()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 1

    .line 98
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->_include:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-object p0
.end method

.method public getIncludeAsProperty()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;
    .registers 1

    .line 103
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->_includeAsProperty:Lcom/fasterxml/jackson/annotation/JsonInclude$Value;

    return-object p0
.end method

.method public getIsIgnoredType()Ljava/lang/Boolean;
    .registers 1

    .line 108
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->_isIgnoredType:Ljava/lang/Boolean;

    return-object p0
.end method

.method public getMergeable()Ljava/lang/Boolean;
    .registers 1

    .line 124
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->_mergeable:Ljava/lang/Boolean;

    return-object p0
.end method

.method public getSetterInfo()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;
    .registers 1

    .line 114
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->_setterInfo:Lcom/fasterxml/jackson/annotation/JsonSetter$Value;

    return-object p0
.end method

.method public getVisibility()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;
    .registers 1

    .line 119
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;->_visibility:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.cfg.ConfigOverride.Empty (com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty)
.class final Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;
.super Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Empty"
.end annotation


# static fields
.field static final INSTANCE:Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 133
    new-instance v0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;->INSTANCE:Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .line 135
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;-><init>()V

    return-void
.end method
