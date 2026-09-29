###### Class com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator (com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator)
.class public abstract Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Base;,
        Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract validateBaseType(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;"
        }
    .end annotation
.end method

.method public abstract validateSubClassName(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Ljava/lang/String;",
            ")",
            "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation
.end method

.method public abstract validateSubType(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation
.end method

###### Class com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base (com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Base)
.class public abstract Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Base;
.super Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Base"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 149
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;-><init>()V

    return-void
.end method


# virtual methods
.method public validateBaseType(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;"
        }
    .end annotation

    .line 157
    sget-object p0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->INDETERMINATE:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    return-object p0
.end method

.method public validateSubClassName(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Ljava/lang/String;",
            ")",
            "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 163
    sget-object p0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->INDETERMINATE:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    return-object p0
.end method

.method public validateSubType(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 169
    sget-object p0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->INDETERMINATE:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Validity (com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Validity)
.class public final enum Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Validity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

.field public static final enum ALLOWED:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

.field public static final enum DENIED:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

.field public static final enum INDETERMINATE:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 62
    new-instance v0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    const-string v1, "ALLOWED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->ALLOWED:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    .line 67
    new-instance v1, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    const-string v2, "DENIED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->DENIED:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    .line 76
    new-instance v2, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    const-string v3, "INDETERMINATE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->INDETERMINATE:Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    .line 58
    filled-new-array {v0, v1, v2}, [Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->$VALUES:[Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 58
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    .registers 2

    .line 58
    const-class v0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;
    .registers 1

    .line 58
    sget-object v0, Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->$VALUES:[Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/jsontype/PolymorphicTypeValidator$Validity;

    return-object v0
.end method
