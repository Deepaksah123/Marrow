###### Class com.fasterxml.jackson.core.util.VersionUtil (com.fasterxml.jackson.core.util.VersionUtil)
.class public Lcom/fasterxml/jackson/core/util/VersionUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final V_SEP:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 28
    const-string v0, "[-_./;:]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/util/VersionUtil;->V_SEP:Ljava/util/regex/Pattern;

    return-void
.end method

.method protected constructor <init>()V
    .registers 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parseVersion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/core/Version;
    .registers 12

    if-eqz p0, :cond_43

    .line 142
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_43

    .line 143
    sget-object v0, Lcom/fasterxml/jackson/core/util/VersionUtil;->V_SEP:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 144
    aget-object v1, p0, v0

    invoke-static {v1}, Lcom/fasterxml/jackson/core/util/VersionUtil;->parseVersionPart(Ljava/lang/String;)I

    move-result v3

    array-length v1, p0

    const/4 v2, 0x1

    if-le v1, v2, :cond_25

    aget-object v1, p0, v2

    .line 145
    invoke-static {v1}, Lcom/fasterxml/jackson/core/util/VersionUtil;->parseVersionPart(Ljava/lang/String;)I

    move-result v1

    move v4, v1

    goto :goto_26

    :cond_25
    move v4, v0

    :goto_26
    array-length v1, p0

    const/4 v2, 0x2

    if-le v1, v2, :cond_30

    aget-object v0, p0, v2

    .line 146
    invoke-static {v0}, Lcom/fasterxml/jackson/core/util/VersionUtil;->parseVersionPart(Ljava/lang/String;)I

    move-result v0

    :cond_30
    move v5, v0

    array-length v0, p0

    const/4 v1, 0x3

    if-le v0, v1, :cond_38

    aget-object p0, p0, v1

    goto :goto_39

    :cond_38
    const/4 p0, 0x0

    :goto_39
    move-object v6, p0

    new-instance p0, Lcom/fasterxml/jackson/core/Version;

    move-object v2, p0

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v2 .. v8}, Lcom/fasterxml/jackson/core/Version;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    .line 150
    :cond_43
    invoke-static {}, Lcom/fasterxml/jackson/core/Version;->unknownVersion()Lcom/fasterxml/jackson/core/Version;

    move-result-object p0

    return-object p0
.end method

.method protected static parseVersionPart(Ljava/lang/String;)I
    .registers 6

    .line 155
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v1, v0, :cond_1c

    .line 156
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x39

    if-gt v3, v4, :cond_1c

    const/16 v4, 0x30

    if-lt v3, v4, :cond_1c

    mul-int/lit8 v2, v2, 0xa

    add-int/lit8 v3, v3, -0x30

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_1c
    return v2
.end method

.method public static final throwInternal()V
    .registers 2

    .line 176
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Internal error: this code path should never get executed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
