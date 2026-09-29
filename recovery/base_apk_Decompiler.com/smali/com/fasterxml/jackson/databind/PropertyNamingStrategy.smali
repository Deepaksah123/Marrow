###### Class com.fasterxml.jackson.databind.PropertyNamingStrategy (com.fasterxml.jackson.databind.PropertyNamingStrategy)
.class public Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$KebabCaseStrategy;,
        Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerCaseStrategy;,
        Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerDotCaseStrategy;,
        Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;,
        Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$SnakeCaseStrategy;,
        Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$UpperCamelCaseStrategy;
    }
.end annotation


# static fields
.field public static final CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final KEBAB_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final LOWER_CAMEL_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final LOWER_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final LOWER_DOT_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PASCAL_CASE_TO_CAMEL_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final SNAKE_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final UPPER_CAMEL_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 50
    new-instance v0, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->LOWER_CAMEL_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 59
    new-instance v0, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$UpperCamelCaseStrategy;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$UpperCamelCaseStrategy;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->UPPER_CAMEL_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 68
    new-instance v1, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$SnakeCaseStrategy;

    invoke-direct {v1}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$SnakeCaseStrategy;-><init>()V

    sput-object v1, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->SNAKE_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 77
    new-instance v2, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerCaseStrategy;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerCaseStrategy;-><init>()V

    sput-object v2, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->LOWER_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 86
    new-instance v2, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$KebabCaseStrategy;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$KebabCaseStrategy;-><init>()V

    sput-object v2, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->KEBAB_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 95
    new-instance v2, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerDotCaseStrategy;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerDotCaseStrategy;-><init>()V

    sput-object v2, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->LOWER_DOT_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 401
    sput-object v1, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    .line 407
    sput-object v0, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->PASCAL_CASE_TO_CAMEL_CASE:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public nameForConstructorParameter(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    return-object p3
.end method

.method public nameForField(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    return-object p3
.end method

.method public nameForGetterMethod(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    return-object p3
.end method

.method public nameForSetterMethod(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    return-object p3
.end method

###### Class com.fasterxml.jackson.databind.PropertyNamingStrategy.KebabCaseStrategy (com.fasterxml.jackson.databind.PropertyNamingStrategy$KebabCaseStrategy)
.class public Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$KebabCaseStrategy;
.super Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "KebabCaseStrategy"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 369
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;-><init>()V

    return-void
.end method


# virtual methods
.method public translate(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    const/16 p0, 0x2d

    .line 373
    invoke-static {p1, p0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$KebabCaseStrategy;->translateLowerCaseWithSeparator(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy (com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseStrategy)
.class public Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerCaseStrategy;
.super Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LowerCaseStrategy"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 354
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;-><init>()V

    return-void
.end method


# virtual methods
.method public translate(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 358
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerDotCaseStrategy (com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerDotCaseStrategy)
.class public Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerDotCaseStrategy;
.super Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LowerDotCaseStrategy"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 384
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;-><init>()V

    return-void
.end method


# virtual methods
.method public translate(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    const/16 p0, 0x2e

    .line 387
    invoke-static {p1, p0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$LowerDotCaseStrategy;->translateLowerCaseWithSeparator(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase (com.fasterxml.jackson.databind.PropertyNamingStrategy$PropertyNamingStrategyBase)
.class public abstract Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;
.super Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PropertyNamingStrategyBase"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 193
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;-><init>()V

    return-void
.end method

.method protected static translateLowerCaseWithSeparator(Ljava/lang/String;C)Ljava/lang/String;
    .registers 9

    if-eqz p0, :cond_40

    .line 230
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_9

    goto :goto_40

    .line 235
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    shr-int/lit8 v2, v0, 0x1

    add-int/2addr v2, v0

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_14
    if-ge v3, v0, :cond_3c

    .line 238
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 239
    invoke-static {v5}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v6

    if-ne v6, v5, :cond_2d

    const/4 v5, 0x1

    if-le v4, v5, :cond_2b

    .line 246
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    sub-int/2addr v4, v5

    invoke-virtual {v1, v4, p1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    :cond_2b
    move v4, v2

    goto :goto_36

    :cond_2d
    if-nez v4, :cond_34

    if-lez v3, :cond_34

    .line 252
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_34
    add-int/lit8 v4, v4, 0x1

    .line 256
    :goto_36
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    .line 258
    :cond_3c
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_40
    :goto_40
    return-object p0
.end method


# virtual methods
.method public nameForConstructorParameter(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 217
    invoke-virtual {p0, p3}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;->translate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public nameForField(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 198
    invoke-virtual {p0, p3}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;->translate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public nameForGetterMethod(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 204
    invoke-virtual {p0, p3}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;->translate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public nameForSetterMethod(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 210
    invoke-virtual {p0, p3}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;->translate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public abstract translate(Ljava/lang/String;)Ljava/lang/String;
.end method

###### Class com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy (com.fasterxml.jackson.databind.PropertyNamingStrategy$SnakeCaseStrategy)
.class public Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$SnakeCaseStrategy;
.super Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SnakeCaseStrategy"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 275
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;-><init>()V

    return-void
.end method


# virtual methods
.method public translate(Ljava/lang/String;)Ljava/lang/String;
    .registers 11

    if-eqz p1, :cond_4a

    .line 281
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    .line 282
    new-instance v0, Ljava/lang/StringBuilder;

    shl-int/lit8 v1, p0, 0x1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_11
    if-ge v2, p0, :cond_43

    .line 287
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x5f

    if-gtz v2, :cond_1d

    if-eq v5, v6, :cond_40

    .line 290
    :cond_1d
    invoke-static {v5}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_3b

    if-nez v4, :cond_35

    if-lez v3, :cond_35

    add-int/lit8 v4, v3, -0x1

    .line 292
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v4

    if-eq v4, v6, :cond_35

    .line 294
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    .line 297
    :cond_35
    invoke-static {v5}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v5

    move v4, v8

    goto :goto_3c

    :cond_3b
    move v4, v1

    .line 304
    :goto_3c
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v3, v8

    :cond_40
    add-int/lit8 v2, v2, 0x1

    goto :goto_11

    :cond_43
    if-lez v3, :cond_4a

    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4a
    return-object p1
.end method

###### Class com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy (com.fasterxml.jackson.databind.PropertyNamingStrategy$UpperCamelCaseStrategy)
.class public Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$UpperCamelCaseStrategy;
.super Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpperCamelCaseStrategy"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 319
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy$PropertyNamingStrategyBase;-><init>()V

    return-void
.end method


# virtual methods
.method public translate(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    if-eqz p1, :cond_20

    .line 332
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_20

    const/4 p0, 0x0

    .line 336
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 337
    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    if-eq v0, v1, :cond_20

    .line 341
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    invoke-virtual {v0, p0, v1}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_20
    return-object p1
.end method
