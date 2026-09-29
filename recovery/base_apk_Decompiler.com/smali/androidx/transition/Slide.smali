###### Class androidx.transition.Slide (androidx.transition.Slide)
.class public Landroidx/transition/Slide;
.super Landroidx/transition/Visibility;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Slide$AudioAttributesCompatParcelizer;,
        Landroidx/transition/Slide$write;,
        Landroidx/transition/Slide$read;
    }
.end annotation


# static fields
.field private static final AudioAttributesImplApi21Parcelizer:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

.field private static final MediaBrowserCompatMediaItem:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

.field private static final MediaBrowserCompatSearchResultReceiver:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

.field private static final MediaDescriptionCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

.field private static final MediaMetadataCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

.field private static final RatingCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

.field private static final RemoteActionCompatParcelizer:Landroid/animation/TimeInterpolator;

.field private static final handleMediaPlayPauseIfPendingOnHandler:Landroid/animation/TimeInterpolator;


# instance fields
.field private onCommand:I

.field private onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 54
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->handleMediaPlayPauseIfPendingOnHandler:Landroid/animation/TimeInterpolator;

    .line 55
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->RemoteActionCompatParcelizer:Landroid/animation/TimeInterpolator;

    .line 91
    new-instance v0, Landroidx/transition/Slide$1;

    invoke-direct {v0}, Landroidx/transition/Slide$1;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->MediaBrowserCompatSearchResultReceiver:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    .line 98
    new-instance v0, Landroidx/transition/Slide$3;

    invoke-direct {v0}, Landroidx/transition/Slide$3;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->MediaBrowserCompatMediaItem:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    .line 113
    new-instance v0, Landroidx/transition/Slide$4;

    invoke-direct {v0}, Landroidx/transition/Slide$4;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->MediaMetadataCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    .line 120
    new-instance v0, Landroidx/transition/Slide$5;

    invoke-direct {v0}, Landroidx/transition/Slide$5;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->RatingCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    .line 127
    new-instance v0, Landroidx/transition/Slide$2;

    invoke-direct {v0}, Landroidx/transition/Slide$2;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->MediaDescriptionCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    .line 142
    new-instance v0, Landroidx/transition/Slide$6;

    invoke-direct {v0}, Landroidx/transition/Slide$6;-><init>()V

    sput-object v0, Landroidx/transition/Slide;->AudioAttributesImplApi21Parcelizer:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 153
    invoke-direct {p0}, Landroidx/transition/Visibility;-><init>()V

    .line 57
    sget-object v0, Landroidx/transition/Slide;->AudioAttributesImplApi21Parcelizer:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    iput-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    const/16 v0, 0x50

    .line 58
    iput v0, p0, Landroidx/transition/Slide;->onCommand:I

    .line 154
    invoke-direct {p0, v0}, Landroidx/transition/Slide;->write(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 165
    invoke-direct {p0, p1, p2}, Landroidx/transition/Visibility;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    sget-object v0, Landroidx/transition/Slide;->AudioAttributesImplApi21Parcelizer:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    iput-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    const/16 v0, 0x50

    .line 58
    iput v0, p0, Landroidx/transition/Slide;->onCommand:I

    .line 166
    sget-object v1, Lo/recordRemarketingPing;->AudioAttributesImplApi21Parcelizer:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 167
    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    const-string v1, "slideEdge"

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2, v0}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 169
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 171
    invoke-direct {p0, p2}, Landroidx/transition/Slide;->write(I)V

    return-void
.end method

.method private static IconCompatParcelizer(Lo/Rstring;)V
    .registers 3

    .line 175
    iget-object v0, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    const/4 v1, 0x2

    .line 176
    new-array v1, v1, [I

    .line 177
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 178
    iget-object p0, p0, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private write(I)V
    .registers 3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_39

    const/4 v0, 0x5

    if-eq p1, v0, :cond_34

    const/16 v0, 0x30

    if-eq p1, v0, :cond_2f

    const/16 v0, 0x50

    if-eq p1, v0, :cond_2a

    const v0, 0x800003

    if-eq p1, v0, :cond_25

    const v0, 0x800005

    if-ne p1, v0, :cond_1d

    .line 224
    sget-object v0, Landroidx/transition/Slide;->MediaDescriptionCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    iput-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    goto :goto_3d

    .line 227
    :cond_1d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid slide direction"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 221
    :cond_25
    sget-object v0, Landroidx/transition/Slide;->MediaBrowserCompatMediaItem:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    iput-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    goto :goto_3d

    .line 218
    :cond_2a
    sget-object v0, Landroidx/transition/Slide;->AudioAttributesImplApi21Parcelizer:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    iput-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    goto :goto_3d

    .line 212
    :cond_2f
    sget-object v0, Landroidx/transition/Slide;->MediaMetadataCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    iput-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    goto :goto_3d

    .line 215
    :cond_34
    sget-object v0, Landroidx/transition/Slide;->RatingCompat:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    iput-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    goto :goto_3d

    .line 209
    :cond_39
    sget-object v0, Landroidx/transition/Slide;->MediaBrowserCompatSearchResultReceiver:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    iput-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    .line 229
    :goto_3d
    iput p1, p0, Landroidx/transition/Slide;->onCommand:I

    .line 230
    new-instance v0, Lo/DoubleClickConversionReporter;

    invoke-direct {v0}, Lo/DoubleClickConversionReporter;-><init>()V

    .line 231
    invoke-virtual {v0, p1}, Lo/DoubleClickConversionReporter;->write(I)V

    .line 232
    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->read(Lo/Rcolor;)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 15

    if-nez p3, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 270
    :cond_4
    iget-object p4, p3, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [I

    .line 271
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v4

    .line 272
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v5

    .line 273
    iget-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    invoke-interface {v0, p1, p2}, Landroidx/transition/Slide$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v6

    .line 274
    iget-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    invoke-interface {v0, p1, p2}, Landroidx/transition/Slide$AudioAttributesCompatParcelizer;->read(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v7

    const/4 p1, 0x0

    .line 275
    aget v2, p4, p1

    const/4 p1, 0x1

    aget v3, p4, p1

    sget-object v8, Landroidx/transition/Slide;->RemoteActionCompatParcelizer:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p3

    move-object v9, p0

    .line 276
    invoke-static/range {v0 .. v9}, Lo/addPackageToPreferred;->RemoteActionCompatParcelizer(Landroid/view/View;Lo/Rstring;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 2

    .line 189
    invoke-super {p0, p1}, Landroidx/transition/Visibility;->RemoteActionCompatParcelizer(Lo/Rstring;)V

    .line 190
    invoke-static {p1}, Landroidx/transition/Slide;->IconCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final read(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 15

    if-nez p4, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 254
    :cond_4
    iget-object p3, p4, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:slide:screenPosition"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [I

    .line 255
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v6

    .line 256
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v7

    .line 257
    iget-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    invoke-interface {v0, p1, p2}, Landroidx/transition/Slide$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v4

    .line 258
    iget-object v0, p0, Landroidx/transition/Slide;->onCustomAction:Landroidx/transition/Slide$AudioAttributesCompatParcelizer;

    invoke-interface {v0, p1, p2}, Landroidx/transition/Slide$AudioAttributesCompatParcelizer;->read(Landroid/view/ViewGroup;Landroid/view/View;)F

    move-result v5

    const/4 p1, 0x0

    .line 259
    aget v2, p3, p1

    const/4 p1, 0x1

    aget v3, p3, p1

    sget-object v8, Landroidx/transition/Slide;->handleMediaPlayPauseIfPendingOnHandler:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p4

    move-object v9, p0

    .line 260
    invoke-static/range {v0 .. v9}, Lo/addPackageToPreferred;->RemoteActionCompatParcelizer(Landroid/view/View;Lo/Rstring;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public final read(Lo/Rstring;)V
    .registers 2

    .line 183
    invoke-super {p0, p1}, Landroidx/transition/Visibility;->read(Lo/Rstring;)V

    .line 184
    invoke-static {p1}, Landroidx/transition/Slide;->IconCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final read()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.transition.Slide.AnonymousClass1 (androidx.transition.Slide$1)
.class final Landroidx/transition/Slide$1;
.super Landroidx/transition/Slide$write;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, v0}, Landroidx/transition/Slide$write;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 3

    .line 94
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p0, p1

    return p0
.end method

###### Class androidx.transition.Slide.AnonymousClass2 (androidx.transition.Slide$2)
.class final Landroidx/transition/Slide$2;
.super Landroidx/transition/Slide$write;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 127
    invoke-direct {p0, v0}, Landroidx/transition/Slide$write;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 4

    .line 130
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_12

    .line 134
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p0, p1

    return p0

    .line 136
    :cond_12
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p0, p1

    return p0
.end method

###### Class androidx.transition.Slide.AnonymousClass3 (androidx.transition.Slide$3)
.class final Landroidx/transition/Slide$3;
.super Landroidx/transition/Slide$write;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 98
    invoke-direct {p0, v0}, Landroidx/transition/Slide$write;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 4

    .line 101
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_12

    .line 105
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p0, p1

    return p0

    .line 107
    :cond_12
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p0, p1

    return p0
.end method

###### Class androidx.transition.Slide.AnonymousClass4 (androidx.transition.Slide$4)
.class final Landroidx/transition/Slide$4;
.super Landroidx/transition/Slide$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 113
    invoke-direct {p0, v0}, Landroidx/transition/Slide$read;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final read(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 3

    .line 116
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p0, p1

    return p0
.end method

###### Class androidx.transition.Slide.AnonymousClass5 (androidx.transition.Slide$5)
.class final Landroidx/transition/Slide$5;
.super Landroidx/transition/Slide$write;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 120
    invoke-direct {p0, v0}, Landroidx/transition/Slide$write;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 3

    .line 123
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p0, p1

    return p0
.end method

###### Class androidx.transition.Slide.AnonymousClass6 (androidx.transition.Slide$6)
.class final Landroidx/transition/Slide$6;
.super Landroidx/transition/Slide$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 142
    invoke-direct {p0, v0}, Landroidx/transition/Slide$read;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final read(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 3

    .line 145
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p0, p1

    return p0
.end method

###### Class androidx.transition.Slide.AudioAttributesCompatParcelizer (androidx.transition.Slide$AudioAttributesCompatParcelizer)
.class interface abstract Landroidx/transition/Slide$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "AudioAttributesCompatParcelizer"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)F
.end method

.method public abstract read(Landroid/view/ViewGroup;Landroid/view/View;)F
.end method

###### Class androidx.transition.Slide.read (androidx.transition.Slide$read)
.class abstract Landroidx/transition/Slide$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Slide$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "read"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .registers 2

    .line 83
    invoke-direct {p0}, Landroidx/transition/Slide$read;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 3

    .line 87
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p0

    return p0
.end method

###### Class androidx.transition.Slide.write (androidx.transition.Slide$write)
.class abstract Landroidx/transition/Slide$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Slide$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "write"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .registers 2

    .line 75
    invoke-direct {p0}, Landroidx/transition/Slide$write;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 3

    .line 79
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result p0

    return p0
.end method
