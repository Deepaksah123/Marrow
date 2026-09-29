###### Class androidx.core.view.WindowInsetsCompat (androidx.core.view.WindowInsetsCompat)
.class public Landroidx/core/view/WindowInsetsCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;,
        Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;,
        Landroidx/core/view/WindowInsetsCompat$read;,
        Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;,
        Landroidx/core/view/WindowInsetsCompat$write;,
        Landroidx/core/view/WindowInsetsCompat$Impl;,
        Landroidx/core/view/WindowInsetsCompat$Impl20;,
        Landroidx/core/view/WindowInsetsCompat$Impl21;,
        Landroidx/core/view/WindowInsetsCompat$Impl28;,
        Landroidx/core/view/WindowInsetsCompat$Impl29;,
        Landroidx/core/view/WindowInsetsCompat$Impl30;,
        Landroidx/core/view/WindowInsetsCompat$Impl34;,
        Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;,
        Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi21Parcelizer;,
        Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi26Parcelizer;
    }
.end annotation


# static fields
.field public static final IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;


# instance fields
.field private final write:Landroidx/core/view/WindowInsetsCompat$Impl;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_b

    .line 79
    sget-object v0, Landroidx/core/view/WindowInsetsCompat$Impl34;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    sput-object v0, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    return-void

    .line 80
    :cond_b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_16

    .line 81
    sget-object v0, Landroidx/core/view/WindowInsetsCompat$Impl30;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    sput-object v0, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    return-void

    .line 83
    :cond_16
    sget-object v0, Landroidx/core/view/WindowInsetsCompat$Impl;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    sput-object v0, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsets;)V
    .registers 4

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_11

    .line 92
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl34;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl34;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    return-void

    .line 93
    :cond_11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1f

    .line 94
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl30;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl30;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    return-void

    .line 96
    :cond_1f
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl29;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl29;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    return-void
.end method

.method public constructor <init>(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 4

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_78

    .line 116
    iget-object p1, p1, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    .line 117
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_1c

    instance-of v0, p1, Landroidx/core/view/WindowInsetsCompat$Impl34;

    if-eqz v0, :cond_1c

    .line 118
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl34;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/WindowInsetsCompat$Impl34;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/WindowInsetsCompat$Impl34;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl34;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    goto :goto_74

    .line 119
    :cond_1c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_31

    instance-of v0, p1, Landroidx/core/view/WindowInsetsCompat$Impl30;

    if-eqz v0, :cond_31

    .line 120
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl30;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/WindowInsetsCompat$Impl30;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/WindowInsetsCompat$Impl30;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl30;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    goto :goto_74

    .line 121
    :cond_31
    instance-of v0, p1, Landroidx/core/view/WindowInsetsCompat$Impl29;

    if-eqz v0, :cond_40

    .line 122
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl29;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/WindowInsetsCompat$Impl29;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/WindowInsetsCompat$Impl29;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl29;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    goto :goto_74

    .line 123
    :cond_40
    instance-of v0, p1, Landroidx/core/view/WindowInsetsCompat$Impl28;

    if-eqz v0, :cond_4f

    .line 124
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl28;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/WindowInsetsCompat$Impl28;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/WindowInsetsCompat$Impl28;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl28;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    goto :goto_74

    .line 125
    :cond_4f
    instance-of v0, p1, Landroidx/core/view/WindowInsetsCompat$Impl21;

    if-eqz v0, :cond_5e

    .line 126
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl21;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/WindowInsetsCompat$Impl21;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/WindowInsetsCompat$Impl21;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl21;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    goto :goto_74

    .line 127
    :cond_5e
    instance-of v0, p1, Landroidx/core/view/WindowInsetsCompat$Impl20;

    if-eqz v0, :cond_6d

    .line 128
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl20;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/WindowInsetsCompat$Impl20;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/WindowInsetsCompat$Impl20;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl20;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    goto :goto_74

    .line 130
    :cond_6d
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-direct {v0, p0}, Landroidx/core/view/WindowInsetsCompat$Impl;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    .line 132
    :goto_74
    invoke-virtual {p1, p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->copyWindowDataInto(Landroidx/core/view/WindowInsetsCompat;)V

    return-void

    .line 135
    :cond_78
    new-instance p1, Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-direct {p1, p0}, Landroidx/core/view/WindowInsetsCompat$Impl;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Lo/_verifyEndArrayForSingle;IIII)Lo/_verifyEndArrayForSingle;
    .registers 10

    .line 1322
    iget v0, p0, Lo/_verifyEndArrayForSingle;->read:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1323
    iget v2, p0, Lo/_verifyEndArrayForSingle;->write:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1324
    iget v3, p0, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1325
    iget v4, p0, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_26

    if-ne v2, p2, :cond_26

    if-ne v3, p3, :cond_26

    if-ne v1, p4, :cond_26

    return-object p0

    .line 1329
    :cond_26
    invoke-static {v0, v2, v3, v1}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public static IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;
    .registers 2

    const/4 v0, 0x0

    .line 153
    invoke-static {p0, v0}, Landroidx/core/view/WindowInsetsCompat;->write(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public static write(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;
    .registers 3

    .line 172
    new-instance v0, Landroidx/core/view/WindowInsetsCompat;

    invoke-static {p0}, Lo/StringCollectionDeserializer;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, Landroidx/core/view/WindowInsetsCompat;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_28

    .line 173
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_28

    .line 175
    invoke-static {p1}, Lo/InvalidTypeIdException;->handleMediaPlayPauseIfPendingOnHandler(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/core/view/WindowInsetsCompat;->write(Landroidx/core/view/WindowInsetsCompat;)V

    .line 177
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    .line 179
    invoke-virtual {p1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result p0

    invoke-virtual {v0, p0}, Landroidx/core/view/WindowInsetsCompat;->write(I)V

    :cond_28
    return-object v0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()Lo/_verifyEndArrayForSingle;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 548
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/view/View;)V
    .registers 2

    .line 2245
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->copyRootViewBounds(Landroid/view/View;)V

    return-void
.end method

.method public AudioAttributesCompatParcelizer(I)Z
    .registers 2

    .line 706
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->isVisible(I)Z

    move-result p0

    return p0
.end method

.method public AudioAttributesImplApi21Parcelizer()I
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 197
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    iget p0, p0, Lo/_verifyEndArrayForSingle;->read:I

    return p0
.end method

.method public AudioAttributesImplApi26Parcelizer()Lo/_verifyEndArrayForSingle;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 602
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemGestureInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public AudioAttributesImplBaseParcelizer()I
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 245
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    iget p0, p0, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    return p0
.end method

.method public IconCompatParcelizer()Landroidx/core/view/WindowInsetsCompat;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 323
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->consumeSystemWindowInsets()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public IconCompatParcelizer(IIII)Landroidx/core/view/WindowInsetsCompat;
    .registers 5

    .line 646
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/core/view/WindowInsetsCompat$Impl;->inset(IIII)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()I
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 213
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    iget p0, p0, Lo/_verifyEndArrayForSingle;->write:I

    return p0
.end method

.method public MediaBrowserCompatItemReceiver()I
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 229
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    iget p0, p0, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    return p0
.end method

.method public MediaBrowserCompatMediaItem()Landroid/view/WindowInsets;
    .registers 2

    .line 733
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    instance-of v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;

    if-eqz v0, :cond_b

    check-cast p0, Landroidx/core/view/WindowInsetsCompat$Impl20;

    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    return-object p0

    :cond_b
    const/4 p0, 0x0

    return-object p0
.end method

.method public MediaBrowserCompatSearchResultReceiver()Z
    .registers 1

    .line 292
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->isConsumed()Z

    move-result p0

    return p0
.end method

.method public MediaMetadataCompat()Z
    .registers 3

    .line 273
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/core/view/WindowInsetsCompat;->read(I)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    sget-object v1, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 274
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer()I

    move-result v0

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer()I

    move-result v1

    xor-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/core/view/WindowInsetsCompat;->RemoteActionCompatParcelizer(I)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    sget-object v1, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 275
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat;->RemoteActionCompatParcelizer()Lo/_fromBytes;

    move-result-object p0

    if-nez p0, :cond_2d

    const/4 p0, 0x0

    return p0

    :cond_2d
    const/4 p0, 0x1

    return p0
.end method

.method public RatingCompat()Z
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 262
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    sget-object v0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public RemoteActionCompatParcelizer()Lo/_fromBytes;
    .registers 1

    .line 492
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getDisplayCutout()Lo/_fromBytes;

    move-result-object p0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(I)Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 689
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->getInsetsIgnoringVisibility(I)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    if-ne p0, p1, :cond_4

    const/4 p0, 0x1

    return p0

    .line 714
    :cond_4
    instance-of v0, p1, Landroidx/core/view/WindowInsetsCompat;

    if-nez v0, :cond_a

    const/4 p0, 0x0

    return p0

    .line 717
    :cond_a
    check-cast p1, Landroidx/core/view/WindowInsetsCompat;

    .line 718
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    iget-object p1, p1, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-static {p0, p1}, Lo/configureFromStringCreator;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public hashCode()I
    .registers 1

    .line 723
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public read()Landroidx/core/view/WindowInsetsCompat;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 507
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->consumeDisplayCutout()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public read(IIII)Landroidx/core/view/WindowInsetsCompat;
    .registers 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 344
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    .line 345
    invoke-static {p1, p2, p3, p4}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write(Lo/_verifyEndArrayForSingle;)Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;

    move-result-object p0

    .line 346
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public read(I)Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 662
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->getInsets(I)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method read(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 2241
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->setRootViewData(Lo/_verifyEndArrayForSingle;)V

    return-void
.end method

.method read([Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1715
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->setOverriddenInsets([Lo/_verifyEndArrayForSingle;)V

    return-void
.end method

.method public write()Landroidx/core/view/WindowInsetsCompat;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 480
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->consumeStableInsets()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method write(I)V
    .registers 2

    .line 2249
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->setSystemUiVisibility(I)V

    return-void
.end method

.method public write(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 2

    .line 2237
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat;->write:Landroidx/core/view/WindowInsetsCompat$Impl;

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->setRootWindowInsets(Landroidx/core/view/WindowInsetsCompat;)V

    return-void
.end method

###### Class androidx.core.view.WindowInsetsCompat.AudioAttributesCompatParcelizer (androidx.core.view.WindowInsetsCompat$AudioAttributesCompatParcelizer)
.class Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;
.super Landroidx/core/view/WindowInsetsCompat$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1874
    invoke-direct {p0}, Landroidx/core/view/WindowInsetsCompat$read;-><init>()V

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 2

    .line 1878
    invoke-direct {p0, p1}, Landroidx/core/view/WindowInsetsCompat$read;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    return-void
.end method


# virtual methods
.method IconCompatParcelizer(ILo/_verifyEndArrayForSingle;)V
    .registers 3

    .line 1883
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    .line 1884
    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi21Parcelizer;->read(I)I

    move-result p1

    .line 1885
    invoke-virtual {p2}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer()Landroid/graphics/Insets;

    move-result-object p2

    .line 1883
    invoke-virtual {p0, p1, p2}, Landroid/view/WindowInsets$Builder;->setInsets(ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

###### Class androidx.core.view.WindowInsetsCompat.AudioAttributesImplApi21Parcelizer (androidx.core.view.WindowInsetsCompat$AudioAttributesImplApi21Parcelizer)
.class final Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi21Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation


# direct methods
.method static read(I)I
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    move v2, v1

    :goto_3
    const/16 v3, 0x200

    if-gt v2, v3, :cond_53

    and-int v3, p0, v2

    if-eqz v3, :cond_50

    if-eq v2, v1, :cond_4b

    const/4 v3, 0x2

    if-eq v2, v3, :cond_46

    const/4 v3, 0x4

    if-eq v2, v3, :cond_41

    const/16 v3, 0x8

    if-eq v2, v3, :cond_3c

    const/16 v3, 0x10

    if-eq v2, v3, :cond_37

    const/16 v3, 0x20

    if-eq v2, v3, :cond_32

    const/16 v3, 0x40

    if-eq v2, v3, :cond_2d

    const/16 v3, 0x80

    if-eq v2, v3, :cond_28

    goto :goto_50

    .line 2179
    :cond_28
    invoke-static {}, Landroid/view/WindowInsets$Type;->displayCutout()I

    move-result v3

    goto :goto_4f

    .line 2176
    :cond_2d
    invoke-static {}, Landroid/view/WindowInsets$Type;->tappableElement()I

    move-result v3

    goto :goto_4f

    .line 2173
    :cond_32
    invoke-static {}, Landroid/view/WindowInsets$Type;->mandatorySystemGestures()I

    move-result v3

    goto :goto_4f

    .line 2170
    :cond_37
    invoke-static {}, Landroid/view/WindowInsets$Type;->systemGestures()I

    move-result v3

    goto :goto_4f

    .line 2167
    :cond_3c
    invoke-static {}, Landroid/view/WindowInsets$Type;->ime()I

    move-result v3

    goto :goto_4f

    .line 2164
    :cond_41
    invoke-static {}, Landroid/view/WindowInsets$Type;->captionBar()I

    move-result v3

    goto :goto_4f

    .line 2161
    :cond_46
    invoke-static {}, Landroid/view/WindowInsets$Type;->navigationBars()I

    move-result v3

    goto :goto_4f

    .line 2158
    :cond_4b
    invoke-static {}, Landroid/view/WindowInsets$Type;->statusBars()I

    move-result v3

    :goto_4f
    or-int/2addr v0, v3

    :cond_50
    :goto_50
    shl-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_53
    return v0
.end method

###### Class androidx.core.view.WindowInsetsCompat.AudioAttributesImplApi26Parcelizer (androidx.core.view.WindowInsetsCompat$AudioAttributesImplApi26Parcelizer)
.class final Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi26Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(I)I
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    move v2, v1

    :goto_3
    const/16 v3, 0x200

    if-gt v2, v3, :cond_5a

    and-int v4, p0, v2

    if-eqz v4, :cond_57

    if-eq v2, v1, :cond_52

    const/4 v4, 0x2

    if-eq v2, v4, :cond_4d

    const/4 v4, 0x4

    if-eq v2, v4, :cond_48

    const/16 v4, 0x8

    if-eq v2, v4, :cond_43

    const/16 v4, 0x10

    if-eq v2, v4, :cond_3e

    const/16 v4, 0x20

    if-eq v2, v4, :cond_39

    const/16 v4, 0x40

    if-eq v2, v4, :cond_34

    const/16 v4, 0x80

    if-eq v2, v4, :cond_2f

    if-eq v2, v3, :cond_2a

    goto :goto_57

    .line 2227
    :cond_2a
    invoke-static {}, Landroid/view/WindowInsets$Type;->systemOverlays()I

    move-result v3

    goto :goto_56

    .line 2224
    :cond_2f
    invoke-static {}, Landroid/view/WindowInsets$Type;->displayCutout()I

    move-result v3

    goto :goto_56

    .line 2221
    :cond_34
    invoke-static {}, Landroid/view/WindowInsets$Type;->tappableElement()I

    move-result v3

    goto :goto_56

    .line 2218
    :cond_39
    invoke-static {}, Landroid/view/WindowInsets$Type;->mandatorySystemGestures()I

    move-result v3

    goto :goto_56

    .line 2215
    :cond_3e
    invoke-static {}, Landroid/view/WindowInsets$Type;->systemGestures()I

    move-result v3

    goto :goto_56

    .line 2212
    :cond_43
    invoke-static {}, Landroid/view/WindowInsets$Type;->ime()I

    move-result v3

    goto :goto_56

    .line 2209
    :cond_48
    invoke-static {}, Landroid/view/WindowInsets$Type;->captionBar()I

    move-result v3

    goto :goto_56

    .line 2206
    :cond_4d
    invoke-static {}, Landroid/view/WindowInsets$Type;->navigationBars()I

    move-result v3

    goto :goto_56

    .line 2203
    :cond_52
    invoke-static {}, Landroid/view/WindowInsets$Type;->statusBars()I

    move-result v3

    :goto_56
    or-int/2addr v0, v3

    :cond_57
    :goto_57
    shl-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5a
    return v0
.end method

###### Class androidx.core.view.WindowInsetsCompat.IconCompatParcelizer (androidx.core.view.WindowInsetsCompat$IconCompatParcelizer)
.class Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private final IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

.field write:[Lo/_verifyEndArrayForSingle;


# direct methods
.method constructor <init>()V
    .registers 3

    .line 1633
    new-instance v0, Landroidx/core/view/WindowInsetsCompat;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/core/view/WindowInsetsCompat;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    invoke-direct {p0, v0}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 2

    .line 1636
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1637
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method


# virtual methods
.method AudioAttributesCompatParcelizer(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

.method IconCompatParcelizer()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 1709
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    .line 1710
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    return-object p0
.end method

.method IconCompatParcelizer(ILo/_verifyEndArrayForSingle;)V
    .registers 6

    .line 1654
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    if-nez v0, :cond_a

    const/16 v0, 0xa

    .line 1655
    new-array v0, v0, [Lo/_verifyEndArrayForSingle;

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    :cond_a
    const/4 v0, 0x1

    :goto_b
    const/16 v1, 0x200

    if-gt v0, v1, :cond_1e

    and-int v1, p1, v0

    if-eqz v1, :cond_1b

    .line 1661
    iget-object v1, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    invoke-static {v0}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)I

    move-result v2

    aput-object p2, v1, v2

    :cond_1b
    shl-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_1e
    return-void
.end method

.method IconCompatParcelizer(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

.method protected final RemoteActionCompatParcelizer()V
    .registers 6

    .line 1682
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    if-eqz v0, :cond_58

    const/4 v1, 0x1

    .line 1683
    invoke-static {v1}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)I

    move-result v2

    aget-object v0, v0, v2

    .line 1684
    iget-object v2, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    const/4 v3, 0x2

    invoke-static {v3}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)I

    move-result v4

    aget-object v2, v2, v4

    if-nez v2, :cond_1c

    .line 1689
    iget-object v2, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v2, v3}, Landroidx/core/view/WindowInsetsCompat;->read(I)Lo/_verifyEndArrayForSingle;

    move-result-object v2

    :cond_1c
    if-nez v0, :cond_24

    .line 1692
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v0, v1}, Landroidx/core/view/WindowInsetsCompat;->read(I)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    .line 1695
    :cond_24
    invoke-static {v0, v2}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer(Lo/_verifyEndArrayForSingle;Lo/_verifyEndArrayForSingle;)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->IconCompatParcelizer(Lo/_verifyEndArrayForSingle;)V

    .line 1697
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    const/16 v1, 0x10

    invoke-static {v1}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3a

    .line 1698
    invoke-virtual {p0, v0}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Lo/_verifyEndArrayForSingle;)V

    .line 1700
    :cond_3a
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    const/16 v1, 0x20

    invoke-static {v1}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_49

    .line 1701
    invoke-virtual {p0, v0}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/_verifyEndArrayForSingle;)V

    .line 1703
    :cond_49
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    const/16 v1, 0x40

    invoke-static {v1}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_58

    .line 1704
    invoke-virtual {p0, v0}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write(Lo/_verifyEndArrayForSingle;)V

    :cond_58
    return-void
.end method

.method RemoteActionCompatParcelizer(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

.method read(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

.method write(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

###### Class androidx.core.view.WindowInsetsCompat.Impl (androidx.core.view.WindowInsetsCompat$Impl)
.class Landroidx/core/view/WindowInsetsCompat$Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Impl"
.end annotation


# static fields
.field static final CONSUMED:Landroidx/core/view/WindowInsetsCompat;


# instance fields
.field final mHost:Landroidx/core/view/WindowInsetsCompat;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 738
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;-><init>()V

    .line 739
    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write()Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    .line 740
    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat;->read()Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    .line 741
    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat;->write()Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    .line 742
    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer()Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    sput-object v0, Landroidx/core/view/WindowInsetsCompat$Impl;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 2

    .line 746
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 747
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl;->mHost:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method


# virtual methods
.method consumeDisplayCutout()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 771
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl;->mHost:Landroidx/core/view/WindowInsetsCompat;

    return-object p0
.end method

.method consumeStableInsets()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 763
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl;->mHost:Landroidx/core/view/WindowInsetsCompat;

    return-object p0
.end method

.method consumeSystemWindowInsets()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 759
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl;->mHost:Landroidx/core/view/WindowInsetsCompat;

    return-object p0
.end method

.method copyRootViewBounds(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method copyWindowDataInto(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 2

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 820
    :cond_4
    instance-of v1, p1, Landroidx/core/view/WindowInsetsCompat$Impl;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    .line 821
    :cond_a
    check-cast p1, Landroidx/core/view/WindowInsetsCompat$Impl;

    .line 822
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->isRound()Z

    move-result v1

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->isRound()Z

    move-result v3

    if-ne v1, v3, :cond_4b

    .line 823
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->isConsumed()Z

    move-result v1

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->isConsumed()Z

    move-result v3

    if-ne v1, v3, :cond_4b

    .line 824
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object v3

    invoke-static {v1, v3}, Lo/configureFromStringCreator;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4b

    .line 825
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->getStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object v3

    invoke-static {v1, v3}, Lo/configureFromStringCreator;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4b

    .line 826
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getDisplayCutout()Lo/_fromBytes;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->getDisplayCutout()Lo/_fromBytes;

    move-result-object p1

    invoke-static {p0, p1}, Lo/configureFromStringCreator;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4b

    return v0

    :cond_4b
    return v2
.end method

.method getDisplayCutout()Lo/_fromBytes;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method getInsets(I)Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 802
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method getInsetsIgnoringVisibility(I)Lo/_verifyEndArrayForSingle;
    .registers 2

    and-int/lit8 p0, p1, 0x8

    if-nez p0, :cond_7

    .line 809
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0

    .line 807
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unable to query the maximum insets for IME"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method getMandatorySystemGestureInsets()Lo/_verifyEndArrayForSingle;
    .registers 1

    .line 789
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method getStableInsets()Lo/_verifyEndArrayForSingle;
    .registers 1

    .line 779
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method getSystemGestureInsets()Lo/_verifyEndArrayForSingle;
    .registers 1

    .line 784
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method getSystemWindowInsets()Lo/_verifyEndArrayForSingle;
    .registers 1

    .line 775
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method getTappableElementInsets()Lo/_verifyEndArrayForSingle;
    .registers 1

    .line 794
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public hashCode()I
    .registers 5

    .line 832
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->isRound()Z

    move-result v0

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->isConsumed()Z

    move-result v1

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object v2

    .line 833
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl;->getDisplayCutout()Lo/_fromBytes;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 832
    invoke-static {p0}, Lo/configureFromStringCreator;->RemoteActionCompatParcelizer([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method inset(IIII)Landroidx/core/view/WindowInsetsCompat;
    .registers 5

    .line 798
    sget-object p0, Landroidx/core/view/WindowInsetsCompat$Impl;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    return-object p0
.end method

.method isConsumed()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method isRound()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method isVisible(I)Z
    .registers 2

    const/4 p0, 0x1

    return p0
.end method

.method public setOverriddenInsets([Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

.method setRootViewData(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

.method setRootWindowInsets(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 2

    return-void
.end method

.method public setStableInsets(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

.method setSystemUiVisibility(I)V
    .registers 2

    return-void
.end method

###### Class androidx.core.view.WindowInsetsCompat.Impl20 (androidx.core.view.WindowInsetsCompat$Impl20)
.class Landroidx/core/view/WindowInsetsCompat$Impl20;
.super Landroidx/core/view/WindowInsetsCompat$Impl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Impl20"
.end annotation


# static fields
.field private static final SYSTEM_BAR_VISIBILITY_MASK:I = 0x6

.field private static sAttachInfoClass:Ljava/lang/Class; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static sAttachInfoField:Ljava/lang/reflect/Field; = null

.field private static sGetViewRootImplMethod:Ljava/lang/reflect/Method; = null

.field private static sVisibleInsetsField:Ljava/lang/reflect/Field; = null

.field private static sVisibleRectReflectionFetched:Z = false


# instance fields
.field private mOverriddenInsets:[Lo/_verifyEndArrayForSingle;

.field final mPlatformInsets:Landroid/view/WindowInsets;

.field mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

.field private mRootWindowInsets:Landroidx/core/view/WindowInsetsCompat;

.field mSystemUiVisibility:I

.field private mSystemWindowInsets:Lo/_verifyEndArrayForSingle;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V
    .registers 3

    .line 883
    invoke-direct {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    const/4 p1, 0x0

    .line 875
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemWindowInsets:Lo/_verifyEndArrayForSingle;

    .line 884
    iput-object p2, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl20;)V
    .registers 4

    .line 888
    new-instance v0, Landroid/view/WindowInsets;

    iget-object p2, p2, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-direct {v0, p2}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V

    invoke-direct {p0, p1, v0}, Landroidx/core/view/WindowInsetsCompat$Impl20;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    return-void
.end method

.method private getInsets(IZ)Lo/_verifyEndArrayForSingle;
    .registers 6

    .line 922
    sget-object v0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    const/4 v1, 0x1

    :goto_3
    const/16 v2, 0x200

    if-gt v1, v2, :cond_17

    and-int v2, p1, v1

    if-nez v2, :cond_c

    goto :goto_14

    .line 927
    :cond_c
    invoke-virtual {p0, v1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getInsetsForType(IZ)Lo/_verifyEndArrayForSingle;

    move-result-object v2

    invoke-static {v0, v2}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer(Lo/_verifyEndArrayForSingle;Lo/_verifyEndArrayForSingle;)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    :goto_14
    shl-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_17
    return-object v0
.end method

.method private getRootStableInsets()Lo/_verifyEndArrayForSingle;
    .registers 1

    .line 1086
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootWindowInsets:Landroidx/core/view/WindowInsetsCompat;

    if-eqz p0, :cond_9

    .line 1087
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesCompatParcelizer()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 1089
    :cond_9
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method private getVisibleInsets(Landroid/view/View;)Lo/_verifyEndArrayForSingle;
    .registers 5

    .line 1113
    const-string p0, "WindowInsetsCompat"

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_5e

    .line 1117
    sget-boolean v0, Landroidx/core/view/WindowInsetsCompat$Impl20;->sVisibleRectReflectionFetched:Z

    if-nez v0, :cond_f

    .line 1118
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Impl20;->loadReflectionField()V

    .line 1121
    :cond_f
    sget-object v0, Landroidx/core/view/WindowInsetsCompat$Impl20;->sGetViewRootImplMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-eqz v0, :cond_5d

    sget-object v2, Landroidx/core/view/WindowInsetsCompat$Impl20;->sAttachInfoClass:Ljava/lang/Class;

    if-eqz v2, :cond_5d

    sget-object v2, Landroidx/core/view/WindowInsetsCompat$Impl20;->sVisibleInsetsField:Ljava/lang/reflect/Field;

    if-nez v2, :cond_1d

    goto :goto_5d

    :cond_1d
    const/4 v2, 0x0

    .line 1128
    :try_start_1e
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_31

    .line 1130
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    const-string v0, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"

    invoke-static {p0, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1

    .line 1136
    :cond_31
    sget-object v0, Landroidx/core/view/WindowInsetsCompat$Impl20;->sAttachInfoField:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1137
    sget-object v0, Landroidx/core/view/WindowInsetsCompat$Impl20;->sVisibleInsetsField:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    if-eqz p1, :cond_46

    .line 1138
    invoke-static {p1}, Lo/_verifyEndArrayForSingle;->read(Landroid/graphics/Rect;)Lo/_verifyEndArrayForSingle;

    move-result-object p0
    :try_end_45
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1e .. :try_end_45} :catch_47

    return-object p0

    :cond_46
    return-object v1

    :catch_47
    move-exception p1

    .line 1141
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Failed to get visible insets. (Reflection error). "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1142
    invoke-virtual {p1}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1141
    invoke-static {p0, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_5d
    :goto_5d
    return-object v1

    .line 1114
    :cond_5e
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static loadReflectionField()V
    .registers 4

    const/4 v0, 0x1

    .line 1158
    :try_start_1
    const-class v1, Landroid/view/View;

    const-string v2, "getViewRootImpl"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Landroidx/core/view/WindowInsetsCompat$Impl20;->sGetViewRootImplMethod:Ljava/lang/reflect/Method;

    .line 1159
    const-string v1, "android.view.View$AttachInfo"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Landroidx/core/view/WindowInsetsCompat$Impl20;->sAttachInfoClass:Ljava/lang/Class;

    .line 1160
    const-string v2, "mVisibleInsets"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Landroidx/core/view/WindowInsetsCompat$Impl20;->sVisibleInsetsField:Ljava/lang/reflect/Field;

    .line 1161
    const-string v1, "android.view.ViewRootImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 1162
    const-string v2, "mAttachInfo"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Landroidx/core/view/WindowInsetsCompat$Impl20;->sAttachInfoField:Ljava/lang/reflect/Field;

    .line 1163
    sget-object v1, Landroidx/core/view/WindowInsetsCompat$Impl20;->sVisibleInsetsField:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 1164
    sget-object v1, Landroidx/core/view/WindowInsetsCompat$Impl20;->sAttachInfoField:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_36
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_36} :catch_37

    goto :goto_4f

    :catch_37
    move-exception v1

    .line 1166
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to get visible insets. (Reflection error). "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WindowInsetsCompat"

    invoke-static {v3, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1169
    :goto_4f
    sput-boolean v0, Landroidx/core/view/WindowInsetsCompat$Impl20;->sVisibleRectReflectionFetched:Z

    return-void
.end method

.method static systemBarVisibilityEquals(II)Z
    .registers 2

    and-int/lit8 p0, p0, 0x6

    and-int/lit8 p1, p1, 0x6

    if-ne p0, p1, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method copyRootViewBounds(Landroid/view/View;)V
    .registers 2

    .line 1095
    invoke-direct {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getVisibleInsets(Landroid/view/View;)Lo/_verifyEndArrayForSingle;

    move-result-object p1

    if-nez p1, :cond_8

    .line 1097
    sget-object p1, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    .line 1099
    :cond_8
    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl20;->setRootViewData(Lo/_verifyEndArrayForSingle;)V

    return-void
.end method

.method copyWindowDataInto(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 3

    .line 1069
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootWindowInsets:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->write(Landroidx/core/view/WindowInsetsCompat;)V

    .line 1070
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->read(Lo/_verifyEndArrayForSingle;)V

    .line 1071
    iget p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemUiVisibility:I

    invoke-virtual {p1, p0}, Landroidx/core/view/WindowInsetsCompat;->write(I)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 5

    .line 1174
    invoke-super {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    .line 1175
    :cond_8
    check-cast p1, Landroidx/core/view/WindowInsetsCompat$Impl20;

    .line 1176
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    iget-object v2, p1, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    iget p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemUiVisibility:I

    iget p1, p1, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemUiVisibility:I

    .line 1177
    invoke-static {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl20;->systemBarVisibilityEquals(II)Z

    move-result p0

    if-eqz p0, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_20
    return v1
.end method

.method public getInsets(I)Lo/_verifyEndArrayForSingle;
    .registers 3

    const/4 v0, 0x0

    .line 898
    invoke-direct {p0, p1, v0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getInsets(IZ)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method protected getInsetsForType(IZ)Lo/_verifyEndArrayForSingle;
    .registers 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_e5

    const/4 v0, 0x2

    const/4 v2, 0x0

    if-eq p1, v0, :cond_97

    const/16 p2, 0x8

    if-eq p1, p2, :cond_55

    const/16 p2, 0x10

    if-eq p1, p2, :cond_50

    const/16 p2, 0x20

    if-eq p1, p2, :cond_4b

    const/16 p2, 0x40

    if-eq p1, p2, :cond_46

    const/16 p2, 0x80

    if-eq p1, p2, :cond_1f

    .line 1027
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0

    .line 1016
    :cond_1f
    iget-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootWindowInsets:Landroidx/core/view/WindowInsetsCompat;

    if-eqz p1, :cond_28

    .line 1017
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->RemoteActionCompatParcelizer()Lo/_fromBytes;

    move-result-object p0

    goto :goto_2c

    .line 1018
    :cond_28
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getDisplayCutout()Lo/_fromBytes;

    move-result-object p0

    :goto_2c
    if-eqz p0, :cond_43

    .line 1020
    invoke-virtual {p0}, Lo/_fromBytes;->write()I

    move-result p1

    invoke-virtual {p0}, Lo/_fromBytes;->AudioAttributesImplBaseParcelizer()I

    move-result p2

    .line 1021
    invoke-virtual {p0}, Lo/_fromBytes;->AudioAttributesCompatParcelizer()I

    move-result v0

    invoke-virtual {p0}, Lo/_fromBytes;->read()I

    move-result p0

    .line 1020
    invoke-static {p1, p2, v0, p0}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 1023
    :cond_43
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0

    .line 1012
    :cond_46
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getTappableElementInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 1008
    :cond_4b
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getMandatorySystemGestureInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 1004
    :cond_50
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getSystemGestureInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 980
    :cond_55
    iget-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mOverriddenInsets:[Lo/_verifyEndArrayForSingle;

    if-eqz p1, :cond_5f

    .line 981
    invoke-static {p2}, Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)I

    move-result p2

    aget-object v2, p1, p2

    :cond_5f
    if-eqz v2, :cond_62

    return-object v2

    .line 985
    :cond_62
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p1

    .line 986
    invoke-direct {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getRootStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p2

    .line 988
    iget v0, p1, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    iget v2, p2, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    if-le v0, v2, :cond_77

    .line 991
    iget p0, p1, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    invoke-static {v1, v1, v1, p0}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 992
    :cond_77
    iget-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    if-eqz p1, :cond_94

    sget-object v0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    .line 993
    invoke-virtual {p1, v0}, Lo/_verifyEndArrayForSingle;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_94

    .line 996
    iget-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    iget p1, p1, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    iget p2, p2, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    if-le p1, p2, :cond_94

    .line 997
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    iget p0, p0, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    invoke-static {v1, v1, v1, p0}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 1000
    :cond_94
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0

    :cond_97
    if-eqz p2, :cond_be

    .line 948
    invoke-direct {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getRootStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p1

    .line 949
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    .line 950
    iget p2, p1, Lo/_verifyEndArrayForSingle;->read:I

    iget v0, p0, Lo/_verifyEndArrayForSingle;->read:I

    .line 951
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    iget v0, p1, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    iget v2, p0, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    .line 953
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget p1, p1, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    iget p0, p0, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    .line 954
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 950
    invoke-static {p2, v1, v0, p0}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 956
    :cond_be
    iget p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemUiVisibility:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_c6

    .line 957
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0

    .line 959
    :cond_c6
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p1

    .line 960
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootWindowInsets:Landroidx/core/view/WindowInsetsCompat;

    if-eqz p0, :cond_d2

    .line 961
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesCompatParcelizer()Lo/_verifyEndArrayForSingle;

    move-result-object v2

    .line 964
    :cond_d2
    iget p0, p1, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    if-eqz v2, :cond_dc

    .line 969
    iget p2, v2, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    move-result p0

    .line 971
    :cond_dc
    iget p2, p1, Lo/_verifyEndArrayForSingle;->read:I

    iget p1, p1, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    invoke-static {p2, v1, p1, p0}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    :cond_e5
    if-eqz p2, :cond_fc

    .line 937
    invoke-direct {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getRootStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p1

    .line 938
    iget p1, p1, Lo/_verifyEndArrayForSingle;->write:I

    .line 939
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    iget p0, p0, Lo/_verifyEndArrayForSingle;->write:I

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 938
    invoke-static {v1, p0, v1, v1}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0

    .line 940
    :cond_fc
    iget p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemUiVisibility:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_105

    .line 941
    sget-object p0, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    return-object p0

    .line 943
    :cond_105
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    iget p0, p0, Lo/_verifyEndArrayForSingle;->write:I

    invoke-static {v1, p0, v1, v1}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public getInsetsIgnoringVisibility(I)Lo/_verifyEndArrayForSingle;
    .registers 3

    const/4 v0, 0x1

    .line 903
    invoke-direct {p0, p1, v0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getInsets(IZ)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method final getSystemWindowInsets()Lo/_verifyEndArrayForSingle;
    .registers 5

    .line 1048
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemWindowInsets:Lo/_verifyEndArrayForSingle;

    if-nez v0, :cond_22

    .line 1049
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1050
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v0

    iget-object v1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1051
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v1

    iget-object v2, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1052
    invoke-virtual {v2}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v2

    iget-object v3, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1053
    invoke-virtual {v3}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    .line 1049
    invoke-static {v0, v1, v2, v3}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemWindowInsets:Lo/_verifyEndArrayForSingle;

    .line 1055
    :cond_22
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemWindowInsets:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method inset(IIII)Landroidx/core/view/WindowInsetsCompat;
    .registers 7

    .line 1061
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;

    iget-object v1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-static {v1}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    .line 1062
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getSystemWindowInsets()Lo/_verifyEndArrayForSingle;

    move-result-object v1

    invoke-static {v1, p1, p2, p3, p4}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesCompatParcelizer(Lo/_verifyEndArrayForSingle;IIII)Lo/_verifyEndArrayForSingle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write(Lo/_verifyEndArrayForSingle;)Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;

    .line 1063
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getStableInsets()Lo/_verifyEndArrayForSingle;

    move-result-object p0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesCompatParcelizer(Lo/_verifyEndArrayForSingle;IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->read(Lo/_verifyEndArrayForSingle;)Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;

    .line 1064
    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method isRound()Z
    .registers 1

    .line 893
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->isRound()Z

    move-result p0

    return p0
.end method

.method protected isTypeVisible(I)Z
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_14

    const/4 v2, 0x2

    if-eq p1, v2, :cond_14

    const/4 v2, 0x4

    if-eq p1, v2, :cond_13

    const/16 v2, 0x8

    if-eq p1, v2, :cond_14

    const/16 v2, 0x80

    if-eq p1, v2, :cond_14

    return v1

    :cond_13
    return v0

    .line 1037
    :cond_14
    invoke-virtual {p0, p1, v0}, Landroidx/core/view/WindowInsetsCompat$Impl20;->getInsetsForType(IZ)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    sget-object p1, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer:Lo/_verifyEndArrayForSingle;

    invoke-virtual {p0, p1}, Lo/_verifyEndArrayForSingle;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, v1

    return p0
.end method

.method isVisible(I)Z
    .registers 5

    const/4 v0, 0x1

    move v1, v0

    :goto_2
    const/16 v2, 0x200

    if-gt v1, v2, :cond_16

    and-int v2, p1, v1

    if-nez v2, :cond_b

    goto :goto_13

    .line 913
    :cond_b
    invoke-virtual {p0, v1}, Landroidx/core/view/WindowInsetsCompat$Impl20;->isTypeVisible(I)Z

    move-result v2

    if-nez v2, :cond_13

    const/4 p0, 0x0

    return p0

    :cond_13
    :goto_13
    shl-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_16
    return v0
.end method

.method public setOverriddenInsets([Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1151
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mOverriddenInsets:[Lo/_verifyEndArrayForSingle;

    return-void
.end method

.method setRootViewData(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1081
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    return-void
.end method

.method setRootWindowInsets(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 2

    .line 1076
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mRootWindowInsets:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method

.method setSystemUiVisibility(I)V
    .registers 2

    .line 1104
    iput p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl20;->mSystemUiVisibility:I

    return-void
.end method

###### Class androidx.core.view.WindowInsetsCompat.Impl21 (androidx.core.view.WindowInsetsCompat$Impl21)
.class Landroidx/core/view/WindowInsetsCompat$Impl21;
.super Landroidx/core/view/WindowInsetsCompat$Impl20;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Impl21"
.end annotation


# instance fields
.field private mStableInsets:Lo/_verifyEndArrayForSingle;


# direct methods
.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V
    .registers 3

    .line 1190
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl20;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 1187
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mStableInsets:Lo/_verifyEndArrayForSingle;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl21;)V
    .registers 3

    .line 1194
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl20;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl20;)V

    const/4 p1, 0x0

    .line 1187
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mStableInsets:Lo/_verifyEndArrayForSingle;

    .line 1195
    iget-object p1, p2, Landroidx/core/view/WindowInsetsCompat$Impl21;->mStableInsets:Lo/_verifyEndArrayForSingle;

    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mStableInsets:Lo/_verifyEndArrayForSingle;

    return-void
.end method


# virtual methods
.method consumeStableInsets()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 1205
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method consumeSystemWindowInsets()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 1210
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method final getStableInsets()Lo/_verifyEndArrayForSingle;
    .registers 5

    .line 1215
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mStableInsets:Lo/_verifyEndArrayForSingle;

    if-nez v0, :cond_22

    .line 1216
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1217
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1218
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1219
    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1220
    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    .line 1216
    invoke-static {v0, v1, v2, v3}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mStableInsets:Lo/_verifyEndArrayForSingle;

    .line 1222
    :cond_22
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mStableInsets:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method isConsumed()Z
    .registers 1

    .line 1200
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result p0

    return p0
.end method

.method public setStableInsets(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1227
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl21;->mStableInsets:Lo/_verifyEndArrayForSingle;

    return-void
.end method

###### Class androidx.core.view.WindowInsetsCompat.Impl28 (androidx.core.view.WindowInsetsCompat$Impl28)
.class Landroidx/core/view/WindowInsetsCompat$Impl28;
.super Landroidx/core/view/WindowInsetsCompat$Impl21;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Impl28"
.end annotation


# direct methods
.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V
    .registers 3

    .line 1235
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl21;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl28;)V
    .registers 3

    .line 1239
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl21;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl21;)V

    return-void
.end method


# virtual methods
.method consumeDisplayCutout()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 1249
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl28;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeDisplayCutout()Landroid/view/WindowInsets;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 1255
    :cond_4
    instance-of v1, p1, Landroidx/core/view/WindowInsetsCompat$Impl28;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    .line 1256
    :cond_a
    check-cast p1, Landroidx/core/view/WindowInsetsCompat$Impl28;

    .line 1258
    iget-object v1, p0, Landroidx/core/view/WindowInsetsCompat$Impl28;->mPlatformInsets:Landroid/view/WindowInsets;

    iget-object v3, p1, Landroidx/core/view/WindowInsetsCompat$Impl28;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2b

    iget-object v1, p0, Landroidx/core/view/WindowInsetsCompat$Impl28;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    iget-object v3, p1, Landroidx/core/view/WindowInsetsCompat$Impl28;->mRootViewVisibleInsets:Lo/_verifyEndArrayForSingle;

    .line 1259
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2b

    iget p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl28;->mSystemUiVisibility:I

    iget p1, p1, Landroidx/core/view/WindowInsetsCompat$Impl28;->mSystemUiVisibility:I

    .line 1260
    invoke-static {p0, p1}, Landroidx/core/view/WindowInsetsCompat$Impl28;->systemBarVisibilityEquals(II)Z

    move-result p0

    if-eqz p0, :cond_2b

    return v0

    :cond_2b
    return v2
.end method

.method getDisplayCutout()Lo/_fromBytes;
    .registers 1

    .line 1244
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl28;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object p0

    invoke-static {p0}, Lo/_fromBytes;->AudioAttributesCompatParcelizer(Landroid/view/DisplayCutout;)Lo/_fromBytes;

    move-result-object p0

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    .line 1266
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl28;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->hashCode()I

    move-result p0

    return p0
.end method

###### Class androidx.core.view.WindowInsetsCompat.Impl29 (androidx.core.view.WindowInsetsCompat$Impl29)
.class Landroidx/core/view/WindowInsetsCompat$Impl29;
.super Landroidx/core/view/WindowInsetsCompat$Impl28;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Impl29"
.end annotation


# instance fields
.field private mMandatorySystemGestureInsets:Lo/_verifyEndArrayForSingle;

.field private mSystemGestureInsets:Lo/_verifyEndArrayForSingle;

.field private mTappableElementInsets:Lo/_verifyEndArrayForSingle;


# direct methods
.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V
    .registers 3

    .line 1278
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl28;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 1273
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mSystemGestureInsets:Lo/_verifyEndArrayForSingle;

    .line 1274
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mMandatorySystemGestureInsets:Lo/_verifyEndArrayForSingle;

    .line 1275
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mTappableElementInsets:Lo/_verifyEndArrayForSingle;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl29;)V
    .registers 3

    .line 1282
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl28;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl28;)V

    const/4 p1, 0x0

    .line 1273
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mSystemGestureInsets:Lo/_verifyEndArrayForSingle;

    .line 1274
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mMandatorySystemGestureInsets:Lo/_verifyEndArrayForSingle;

    .line 1275
    iput-object p1, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mTappableElementInsets:Lo/_verifyEndArrayForSingle;

    return-void
.end method


# virtual methods
.method getMandatorySystemGestureInsets()Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 1295
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mMandatorySystemGestureInsets:Lo/_verifyEndArrayForSingle;

    if-nez v0, :cond_10

    .line 1296
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1297
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lo/_verifyEndArrayForSingle;->write(Landroid/graphics/Insets;)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mMandatorySystemGestureInsets:Lo/_verifyEndArrayForSingle;

    .line 1299
    :cond_10
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mMandatorySystemGestureInsets:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method getSystemGestureInsets()Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 1287
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mSystemGestureInsets:Lo/_verifyEndArrayForSingle;

    if-nez v0, :cond_10

    .line 1288
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lo/_verifyEndArrayForSingle;->write(Landroid/graphics/Insets;)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mSystemGestureInsets:Lo/_verifyEndArrayForSingle;

    .line 1290
    :cond_10
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mSystemGestureInsets:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method getTappableElementInsets()Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 1304
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mTappableElementInsets:Lo/_verifyEndArrayForSingle;

    if-nez v0, :cond_10

    .line 1305
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lo/_verifyEndArrayForSingle;->write(Landroid/graphics/Insets;)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mTappableElementInsets:Lo/_verifyEndArrayForSingle;

    .line 1307
    :cond_10
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mTappableElementInsets:Lo/_verifyEndArrayForSingle;

    return-object p0
.end method

.method inset(IIII)Landroidx/core/view/WindowInsetsCompat;
    .registers 5

    .line 1312
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl29;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public setStableInsets(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    return-void
.end method

###### Class androidx.core.view.WindowInsetsCompat.Impl30 (androidx.core.view.WindowInsetsCompat$Impl30)
.class Landroidx/core/view/WindowInsetsCompat$Impl30;
.super Landroidx/core/view/WindowInsetsCompat$Impl29;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Impl30"
.end annotation


# static fields
.field static final CONSUMED:Landroidx/core/view/WindowInsetsCompat;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1334
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    .line 1335
    invoke-static {v0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    sput-object v0, Landroidx/core/view/WindowInsetsCompat$Impl30;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V
    .registers 3

    .line 1338
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl29;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl30;)V
    .registers 3

    .line 1342
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl29;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl29;)V

    return-void
.end method


# virtual methods
.method final copyRootViewBounds(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public getInsets(I)Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 1347
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl30;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1348
    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi21Parcelizer;->read(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p0

    .line 1347
    invoke-static {p0}, Lo/_verifyEndArrayForSingle;->write(Landroid/graphics/Insets;)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public getInsetsIgnoringVisibility(I)Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 1354
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl30;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1355
    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi21Parcelizer;->read(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    move-result-object p0

    .line 1354
    invoke-static {p0}, Lo/_verifyEndArrayForSingle;->write(Landroid/graphics/Insets;)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public isVisible(I)Z
    .registers 2

    .line 1361
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl30;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi21Parcelizer;->read(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->isVisible(I)Z

    move-result p0

    return p0
.end method

###### Class androidx.core.view.WindowInsetsCompat.Impl34 (androidx.core.view.WindowInsetsCompat$Impl34)
.class Landroidx/core/view/WindowInsetsCompat$Impl34;
.super Landroidx/core/view/WindowInsetsCompat$Impl30;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Impl34"
.end annotation


# static fields
.field static final CONSUMED:Landroidx/core/view/WindowInsetsCompat;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1375
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    .line 1376
    invoke-static {v0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    sput-object v0, Landroidx/core/view/WindowInsetsCompat$Impl34;->CONSUMED:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V
    .registers 3

    .line 1379
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl30;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroid/view/WindowInsets;)V

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl34;)V
    .registers 3

    .line 1383
    invoke-direct {p0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$Impl30;-><init>(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat$Impl30;)V

    return-void
.end method


# virtual methods
.method public getInsets(I)Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 1388
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl34;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1389
    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p0

    .line 1388
    invoke-static {p0}, Lo/_verifyEndArrayForSingle;->write(Landroid/graphics/Insets;)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public getInsetsIgnoringVisibility(I)Lo/_verifyEndArrayForSingle;
    .registers 2

    .line 1395
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl34;->mPlatformInsets:Landroid/view/WindowInsets;

    .line 1396
    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    move-result-object p0

    .line 1395
    invoke-static {p0}, Lo/_verifyEndArrayForSingle;->write(Landroid/graphics/Insets;)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public isVisible(I)Z
    .registers 2

    .line 1402
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$Impl34;->mPlatformInsets:Landroid/view/WindowInsets;

    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets;->isVisible(I)Z

    move-result p0

    return p0
.end method

###### Class androidx.core.view.WindowInsetsCompat.MediaBrowserCompatItemReceiver (androidx.core.view.WindowInsetsCompat$MediaBrowserCompatItemReceiver)
.class public final Landroidx/core/view/WindowInsetsCompat$MediaBrowserCompatItemReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MediaBrowserCompatItemReceiver"
.end annotation


# direct methods
.method public static AudioAttributesCompatParcelizer()I
    .registers 1

    const/4 v0, 0x4

    return v0
.end method

.method public static AudioAttributesImplApi21Parcelizer()I
    .registers 1

    const/16 v0, 0x40

    return v0
.end method

.method public static AudioAttributesImplApi26Parcelizer()I
    .registers 1

    const/16 v0, 0x10

    return v0
.end method

.method public static AudioAttributesImplBaseParcelizer()I
    .registers 1

    const/16 v0, 0x207

    return v0
.end method

.method public static IconCompatParcelizer()I
    .registers 1

    const/16 v0, 0x8

    return v0
.end method

.method static IconCompatParcelizer(I)I
    .registers 4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_44

    const/4 v1, 0x2

    if-eq p0, v1, :cond_43

    const/4 v0, 0x4

    if-eq p0, v0, :cond_42

    const/16 v1, 0x8

    if-eq p0, v1, :cond_40

    const/16 v2, 0x10

    if-eq p0, v2, :cond_3f

    const/16 v0, 0x20

    if-eq p0, v0, :cond_3d

    const/16 v0, 0x40

    if-eq p0, v0, :cond_3b

    const/16 v0, 0x80

    if-eq p0, v0, :cond_39

    const/16 v0, 0x100

    if-eq p0, v0, :cond_38

    const/16 v0, 0x200

    if-ne p0, v0, :cond_28

    const/16 p0, 0x9

    return p0

    .line 2103
    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "type needs to be >= FIRST and <= LAST, type="

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    return v1

    :cond_39
    const/4 p0, 0x7

    return p0

    :cond_3b
    const/4 p0, 0x6

    return p0

    :cond_3d
    const/4 p0, 0x5

    return p0

    :cond_3f
    return v0

    :cond_40
    const/4 p0, 0x3

    return p0

    :cond_42
    return v1

    :cond_43
    return v0

    :cond_44
    const/4 p0, 0x0

    return p0
.end method

.method public static MediaBrowserCompatCustomActionResultReceiver()I
    .registers 1

    const/4 v0, 0x1

    return v0
.end method

.method public static MediaBrowserCompatItemReceiver()I
    .registers 1

    const/4 v0, 0x2

    return v0
.end method

.method static RemoteActionCompatParcelizer()I
    .registers 1

    const/4 v0, -0x1

    return v0
.end method

.method public static read()I
    .registers 1

    const/16 v0, 0x80

    return v0
.end method

.method public static write()I
    .registers 1

    const/16 v0, 0x20

    return v0
.end method

###### Class androidx.core.view.WindowInsetsCompat.RemoteActionCompatParcelizer (androidx.core.view.WindowInsetsCompat$RemoteActionCompatParcelizer)
.class public final Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private final write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1416
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_11

    .line 1417
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$write;

    invoke-direct {v0}, Landroidx/core/view/WindowInsetsCompat$write;-><init>()V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    return-void

    .line 1418
    :cond_11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1f

    .line 1419
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;-><init>()V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    return-void

    .line 1421
    :cond_1f
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$read;

    invoke-direct {v0}, Landroidx/core/view/WindowInsetsCompat$read;-><init>()V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    return-void
.end method

.method public constructor <init>(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 4

    .line 1434
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1435
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_11

    .line 1436
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$write;

    invoke-direct {v0, p1}, Landroidx/core/view/WindowInsetsCompat$write;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    return-void

    .line 1437
    :cond_11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1f

    .line 1438
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    return-void

    .line 1440
    :cond_1f
    new-instance v0, Landroidx/core/view/WindowInsetsCompat$read;

    invoke-direct {v0, p1}, Landroidx/core/view/WindowInsetsCompat$read;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    return-void
.end method


# virtual methods
.method public final read(Lo/_verifyEndArrayForSingle;)Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1599
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->read(Lo/_verifyEndArrayForSingle;)V

    return-object p0
.end method

.method public final write(ILo/_verifyEndArrayForSingle;)Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;
    .registers 4

    .line 1539
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->IconCompatParcelizer(ILo/_verifyEndArrayForSingle;)V

    return-object p0
.end method

.method public final write(Lo/_verifyEndArrayForSingle;)Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1461
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->IconCompatParcelizer(Lo/_verifyEndArrayForSingle;)V

    return-object p0
.end method

.method public final write()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 1623
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write:Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->IconCompatParcelizer()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.core.view.WindowInsetsCompat.read (androidx.core.view.WindowInsetsCompat$read)
.class Landroidx/core/view/WindowInsetsCompat$read;
.super Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;


# direct methods
.method constructor <init>()V
    .registers 2

    .line 1819
    invoke-direct {p0}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;-><init>()V

    .line 1820
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 3

    .line 1824
    invoke-direct {p0, p1}, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    .line 1825
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatMediaItem()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_f

    .line 1827
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_14

    .line 1828
    :cond_f
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_14
    iput-object v0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method AudioAttributesCompatParcelizer(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1838
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method IconCompatParcelizer()Landroidx/core/view/WindowInsetsCompat;
    .registers 2

    .line 1863
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$read;->RemoteActionCompatParcelizer()V

    .line 1864
    iget-object v0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    .line 1865
    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    .line 1864
    invoke-static {v0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    .line 1866
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$IconCompatParcelizer;->write:[Lo/_verifyEndArrayForSingle;

    invoke-virtual {v0, p0}, Landroidx/core/view/WindowInsetsCompat;->read([Lo/_verifyEndArrayForSingle;)V

    return-object v0
.end method

.method IconCompatParcelizer(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1833
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method RemoteActionCompatParcelizer(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1843
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method read(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1853
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method write(Lo/_verifyEndArrayForSingle;)V
    .registers 2

    .line 1848
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

###### Class androidx.core.view.WindowInsetsCompat.write (androidx.core.view.WindowInsetsCompat$write)
.class Landroidx/core/view/WindowInsetsCompat$write;
.super Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/WindowInsetsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1906
    invoke-direct {p0}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

.method constructor <init>(Landroidx/core/view/WindowInsetsCompat;)V
    .registers 2

    .line 1910
    invoke-direct {p0, p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesCompatParcelizer;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    return-void
.end method


# virtual methods
.method IconCompatParcelizer(ILo/_verifyEndArrayForSingle;)V
    .registers 3

    .line 1915
    iget-object p0, p0, Landroidx/core/view/WindowInsetsCompat$read;->AudioAttributesCompatParcelizer:Landroid/view/WindowInsets$Builder;

    .line 1916
    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result p1

    .line 1917
    invoke-virtual {p2}, Lo/_verifyEndArrayForSingle;->RemoteActionCompatParcelizer()Landroid/graphics/Insets;

    move-result-object p2

    .line 1915
    invoke-virtual {p0, p1, p2}, Landroid/view/WindowInsets$Builder;->setInsets(ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
