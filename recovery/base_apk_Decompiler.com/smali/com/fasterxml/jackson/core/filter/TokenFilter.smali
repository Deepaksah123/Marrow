###### Class com.fasterxml.jackson.core.filter.TokenFilter (com.fasterxml.jackson.core.filter.TokenFilter)
.class public Lcom/fasterxml/jackson/core/filter/TokenFilter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;
    }
.end annotation


# static fields
.field public static final INCLUDE_ALL:Lcom/fasterxml/jackson/core/filter/TokenFilter;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 53
    new-instance v0, Lcom/fasterxml/jackson/core/filter/TokenFilter;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/filter/TokenFilter;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/filter/TokenFilter;->INCLUDE_ALL:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    return-void
.end method

.method protected constructor <init>()V
    .registers 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected _includeScalar()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public filterFinishArray()V
    .registers 1

    return-void
.end method

.method public filterFinishObject()V
    .registers 1

    return-void
.end method

.method public filterStartArray()Lcom/fasterxml/jackson/core/filter/TokenFilter;
    .registers 1

    return-object p0
.end method

.method public filterStartObject()Lcom/fasterxml/jackson/core/filter/TokenFilter;
    .registers 1

    return-object p0
.end method

.method public includeElement(I)Lcom/fasterxml/jackson/core/filter/TokenFilter;
    .registers 2

    return-object p0
.end method

.method public includeEmptyArray(Z)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public includeEmptyObject(Z)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public includeProperty(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;
    .registers 2

    return-object p0
.end method

.method public includeRootValue(I)Lcom/fasterxml/jackson/core/filter/TokenFilter;
    .registers 2

    return-object p0
.end method

.method public includeValue(Lcom/fasterxml/jackson/core/JsonParser;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 247
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->_includeScalar()Z

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .line 472
    sget-object v0, Lcom/fasterxml/jackson/core/filter/TokenFilter;->INCLUDE_ALL:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    if-ne p0, v0, :cond_7

    .line 473
    const-string p0, "TokenFilter.INCLUDE_ALL"

    return-object p0

    .line 475
    :cond_7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.core.filter.TokenFilter.Inclusion (com.fasterxml.jackson.core.filter.TokenFilter$Inclusion)
.class public final enum Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/filter/TokenFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Inclusion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

.field public static final enum INCLUDE_ALL_AND_PATH:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

.field public static final enum INCLUDE_NON_NULL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

.field public static final enum ONLY_INCLUDE_ALL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 27
    new-instance v0, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    const-string v1, "ONLY_INCLUDE_ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->ONLY_INCLUDE_ALL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 32
    new-instance v1, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    const-string v2, "INCLUDE_ALL_AND_PATH"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_ALL_AND_PATH:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 39
    new-instance v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    const-string v3, "INCLUDE_NON_NULL"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->INCLUDE_NON_NULL:Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    .line 23
    filled-new-array {v0, v1, v2}, [Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->$VALUES:[Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;
    .registers 2

    .line 23
    const-class v0, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;
    .registers 1

    .line 23
    sget-object v0, Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->$VALUES:[Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/core/filter/TokenFilter$Inclusion;

    return-object v0
.end method
