###### Class androidx.viewpager.widget.PagerTitleStrip (androidx.viewpager.widget.PagerTitleStrip)
.class public Landroidx/viewpager/widget/PagerTitleStrip;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/viewpager/widget/ViewPager$write;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;,
        Landroidx/viewpager/widget/PagerTitleStrip$RemoteActionCompatParcelizer;
    }
.end annotation


# static fields
.field private static final AudioAttributesImplApi26Parcelizer:[I

.field private static final AudioAttributesImplBaseParcelizer:[I


# instance fields
.field AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

.field AudioAttributesImplApi21Parcelizer:I

.field IconCompatParcelizer:Landroid/widget/TextView;

.field private MediaBrowserCompatCustomActionResultReceiver:I

.field private MediaBrowserCompatItemReceiver:I

.field private final MediaBrowserCompatMediaItem:Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private MediaDescriptionCompat:Z

.field private MediaMetadataCompat:I

.field private RatingCompat:I

.field RemoteActionCompatParcelizer:Landroid/widget/TextView;

.field private handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lo/getComponentEnabledSetting;",
            ">;"
        }
    .end annotation
.end field

.field read:F

.field write:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    const v0, 0x1010098

    const v1, 0x10100af

    const v2, 0x1010034

    const v3, 0x1010095

    .line 73
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplBaseParcelizer:[I

    const v0, 0x101038c

    .line 80
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplApi26Parcelizer:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 109
    invoke-direct {p0, p1, v0}, Landroidx/viewpager/widget/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 7

    .line 113
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    .line 61
    iput v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatItemReceiver:I

    const/high16 v0, -0x40800000    # -1.0f

    .line 62
    iput v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    .line 69
    new-instance v0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;-><init>(Landroidx/viewpager/widget/PagerTitleStrip;)V

    iput-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatMediaItem:Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;

    .line 115
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 116
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    sget-object v0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplBaseParcelizer:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x0

    .line 120
    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_4b

    .line 122
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-static {v2, v1}, Lo/_addSuperTypes;->RemoteActionCompatParcelizer(Landroid/widget/TextView;I)V

    .line 123
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-static {v2, v1}, Lo/_addSuperTypes;->RemoteActionCompatParcelizer(Landroid/widget/TextView;I)V

    .line 124
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-static {v2, v1}, Lo/_addSuperTypes;->RemoteActionCompatParcelizer(Landroid/widget/TextView;I)V

    :cond_4b
    const/4 v2, 0x1

    .line 126
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    if-eqz v2, :cond_56

    int-to-float v2, v2

    .line 128
    invoke-virtual {p0, v0, v2}, Landroidx/viewpager/widget/PagerTitleStrip;->setTextSize(IF)V

    :cond_56
    const/4 v2, 0x2

    .line 130
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_70

    .line 131
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 132
    iget-object v3, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 133
    iget-object v3, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 134
    iget-object v3, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_70
    const/4 v2, 0x3

    const/16 v3, 0x50

    .line 136
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    iput v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 137
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 139
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p2

    iput p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplApi21Parcelizer:I

    const p2, 0x3f19999a    # 0.6f

    .line 140
    invoke-virtual {p0, p2}, Landroidx/viewpager/widget/PagerTitleStrip;->setNonPrimaryAlpha(F)V

    .line 142
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 143
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 144
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    if-eqz v1, :cond_c4

    .line 148
    sget-object p2, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplApi26Parcelizer:[I

    invoke-virtual {p1, v1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 149
    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 150
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v0, :cond_c4

    .line 154
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-static {p2}, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer(Landroid/widget/TextView;)V

    .line 155
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-static {p2}, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer(Landroid/widget/TextView;)V

    .line 156
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-static {p2}, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer(Landroid/widget/TextView;)V

    goto :goto_d3

    .line 158
    :cond_c4
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->setSingleLine()V

    .line 159
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->setSingleLine()V

    .line 160
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->setSingleLine()V

    .line 163
    :goto_d3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x41800000    # 16.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    .line 164
    iput p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RatingCompat:I

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/widget/TextView;)V
    .registers 3

    .line 105
    new-instance v0, Landroidx/viewpager/widget/PagerTitleStrip$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/viewpager/widget/PagerTitleStrip$RemoteActionCompatParcelizer;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(ILo/getComponentEnabledSetting;)V
    .registers 8

    const/4 v0, 0x0

    if-eqz p2, :cond_8

    .line 268
    invoke-virtual {p2}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v1

    goto :goto_9

    :cond_8
    move v1, v0

    :goto_9
    const/4 v2, 0x1

    .line 269
    iput-boolean v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaDescriptionCompat:Z

    const/4 v2, 0x0

    if-lez p1, :cond_18

    if-eqz p2, :cond_18

    add-int/lit8 v3, p1, -0x1

    .line 273
    invoke-virtual {p2, v3}, Lo/getComponentEnabledSetting;->read(I)Ljava/lang/CharSequence;

    move-result-object v3

    goto :goto_19

    :cond_18
    move-object v3, v2

    .line 275
    :goto_19
    iget-object v4, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    iget-object v3, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    if-eqz p2, :cond_29

    if-ge p1, v1, :cond_29

    .line 278
    invoke-virtual {p2, p1}, Lo/getComponentEnabledSetting;->read(I)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_2a

    :cond_29
    move-object v4, v2

    .line 277
    :goto_2a
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v3, p1, 0x1

    if-ge v3, v1, :cond_37

    if-eqz p2, :cond_37

    .line 282
    invoke-virtual {p2, v3}, Lo/getComponentEnabledSetting;->read(I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 284
    :cond_37
    iget-object p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr p2, v1

    int-to-float p2, p2

    const v1, 0x3f4ccccd    # 0.8f

    mul-float/2addr p2, v1

    float-to-int p2, p2

    .line 288
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    const/high16 v1, -0x80000000

    .line 289
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 290
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v2, v3

    sub-int/2addr v2, v4

    .line 291
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 292
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 293
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v2, p2, v1}, Landroid/view/View;->measure(II)V

    .line 294
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v2, p2, v1}, Landroid/view/View;->measure(II)V

    .line 295
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {v2, p2, v1}, Landroid/view/View;->measure(II)V

    .line 297
    iput p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatItemReceiver:I

    .line 299
    iget-boolean p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatSearchResultReceiver:Z

    if-nez p2, :cond_8a

    .line 300
    iget p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    invoke-virtual {p0, p1, p2, v0}, Landroidx/viewpager/widget/PagerTitleStrip;->read(IFZ)V

    .line 303
    :cond_8a
    iput-boolean v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaDescriptionCompat:Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer()I
    .registers 1

    .line 181
    iget p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RatingCompat:I

    return p0
.end method

.method final RemoteActionCompatParcelizer(Lo/getComponentEnabledSetting;Lo/getComponentEnabledSetting;)V
    .registers 4

    if-eqz p1, :cond_a

    .line 315
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatMediaItem:Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;

    invoke-virtual {p1, v0}, Lo/getComponentEnabledSetting;->read(Landroid/database/DataSetObserver;)V

    const/4 p1, 0x0

    .line 316
    iput-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/ref/WeakReference;

    :cond_a
    if-eqz p2, :cond_18

    .line 319
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatMediaItem:Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;

    invoke-virtual {p2, p1}, Lo/getComponentEnabledSetting;->RemoteActionCompatParcelizer(Landroid/database/DataSetObserver;)V

    .line 320
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/ref/WeakReference;

    .line 322
    :cond_18
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_2d

    const/4 v0, -0x1

    .line 323
    iput v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatItemReceiver:I

    const/high16 v0, -0x40800000    # -1.0f

    .line 324
    iput v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    .line 325
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer(ILo/getComponentEnabledSetting;)V

    .line 326
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2d
    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 4

    .line 239
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 241
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 242
    instance-of v1, v0, Landroidx/viewpager/widget/ViewPager;

    if-eqz v1, :cond_2d

    .line 247
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    .line 248
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->read()Lo/getComponentEnabledSetting;

    move-result-object v1

    .line 250
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatMediaItem:Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->RemoteActionCompatParcelizer(Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;)Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    .line 251
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatMediaItem:Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->write(Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;)V

    .line 252
    iput-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    .line 253
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/getComponentEnabledSetting;

    goto :goto_29

    :cond_28
    const/4 v0, 0x0

    :goto_29
    invoke-virtual {p0, v0, v1}, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer(Lo/getComponentEnabledSetting;Lo/getComponentEnabledSetting;)V

    return-void

    .line 243
    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "PagerTitleStrip must be a direct child of a ViewPager."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected onDetachedFromWindow()V
    .registers 4

    .line 258
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 259
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_1d

    .line 260
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->read()Lo/getComponentEnabledSetting;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer(Lo/getComponentEnabledSetting;Lo/getComponentEnabledSetting;)V

    .line 261
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->RemoteActionCompatParcelizer(Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;)Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    .line 262
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatMediaItem:Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;)V

    .line 263
    iput-object v1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    :cond_1d
    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    .line 456
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_12

    .line 457
    iget p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    const/4 p2, 0x0

    cmpl-float p3, p1, p2

    if-gez p3, :cond_c

    move p1, p2

    .line 458
    :cond_c
    iget p2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatItemReceiver:I

    const/4 p3, 0x1

    invoke-virtual {p0, p2, p1, p3}, Landroidx/viewpager/widget/PagerTitleStrip;->read(IFZ)V

    :cond_12
    return-void
.end method

.method protected onMeasure(II)V
    .registers 10

    .line 420
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_5d

    .line 425
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v0, v2

    const/4 v2, -0x2

    .line 426
    invoke-static {p2, v0, v2}, Landroidx/viewpager/widget/PagerTitleStrip;->getChildMeasureSpec(III)I

    move-result v3

    .line 429
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    int-to-float v5, v4

    const v6, 0x3e4ccccd    # 0.2f

    mul-float/2addr v5, v6

    float-to-int v5, v5

    .line 431
    invoke-static {p1, v5, v2}, Landroidx/viewpager/widget/PagerTitleStrip;->getChildMeasureSpec(III)I

    move-result p1

    .line 434
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v2, p1, v3}, Landroid/view/View;->measure(II)V

    .line 435
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v2, p1, v3}, Landroid/view/View;->measure(II)V

    .line 436
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {v2, p1, v3}, Landroid/view/View;->measure(II)V

    .line 439
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    if-ne p1, v1, :cond_3e

    .line 441
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_4d

    .line 443
    :cond_3e
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    .line 444
    invoke-virtual {p0}, Landroidx/viewpager/widget/PagerTitleStrip;->write()I

    move-result v1

    add-int/2addr p1, v0

    .line 445
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 448
    :goto_4d
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredState()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    .line 449
    invoke-static {p1, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    .line 451
    invoke-virtual {p0, v4, p1}, Landroidx/viewpager/widget/PagerTitleStrip;->setMeasuredDimension(II)V

    return-void

    .line 422
    :cond_5d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Must measure with an exact width"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method read(IFZ)V
    .registers 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 331
    iget v3, v0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatItemReceiver:I

    if-eq v1, v3, :cond_14

    .line 332
    iget-object v3, v0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v3}, Landroidx/viewpager/widget/ViewPager;->read()Lo/getComponentEnabledSetting;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer(ILo/getComponentEnabledSetting;)V

    goto :goto_1d

    :cond_14
    if-nez p3, :cond_1d

    .line 333
    iget v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    cmpl-float v1, v2, v1

    if-nez v1, :cond_1d

    return-void

    :cond_1d
    :goto_1d
    const/4 v1, 0x1

    .line 337
    iput-boolean v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatSearchResultReceiver:Z

    .line 339
    iget-object v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 340
    iget-object v3, v0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 341
    iget-object v4, v0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 342
    div-int/lit8 v5, v3, 0x2

    .line 344
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v6

    .line 345
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v7

    .line 346
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v8

    .line 347
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    .line 348
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v10

    .line 349
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v11

    add-int v12, v9, v5

    const/high16 v13, 0x3f000000    # 0.5f

    add-float/2addr v13, v2

    const/high16 v14, 0x3f800000    # 1.0f

    cmpl-float v15, v13, v14

    if-lez v15, :cond_58

    sub-float/2addr v13, v14

    :cond_58
    sub-int v14, v6, v12

    add-int v15, v8, v5

    sub-int v15, v6, v15

    sub-int/2addr v15, v12

    int-to-float v12, v15

    mul-float/2addr v12, v13

    float-to-int v12, v12

    sub-int/2addr v14, v12

    sub-int/2addr v14, v5

    add-int/2addr v3, v14

    .line 362
    iget-object v5, v0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/view/View;->getBaseline()I

    move-result v5

    .line 363
    iget-object v12, v0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    move-result v12

    .line 364
    iget-object v13, v0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    move-result v13

    .line 365
    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    move-result v15

    invoke-static {v15, v13}, Ljava/lang/Math;->max(II)I

    move-result v15

    sub-int v5, v15, v5

    sub-int v12, v15, v12

    sub-int/2addr v15, v13

    .line 369
    iget-object v13, v0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    .line 370
    iget-object v2, v0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    move/from16 p1, v4

    .line 371
    iget-object v4, v0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v13, v5

    add-int/2addr v2, v12

    .line 372
    invoke-static {v13, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v4, v15

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 375
    iget v4, v0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatCustomActionResultReceiver:I

    and-int/lit8 v4, v4, 0x70

    const/16 v13, 0x10

    if-eq v4, v13, :cond_b3

    const/16 v13, 0x50

    if-ne v4, v13, :cond_b8

    sub-int/2addr v7, v11

    sub-int v10, v7, v2

    goto :goto_b8

    :cond_b3
    sub-int/2addr v7, v10

    sub-int/2addr v7, v11

    sub-int/2addr v7, v2

    .line 389
    div-int/lit8 v10, v7, 0x2

    :cond_b8
    :goto_b8
    add-int/2addr v5, v10

    add-int/2addr v12, v10

    add-int/2addr v10, v15

    .line 402
    iget-object v2, v0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    .line 403
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v12

    .line 402
    invoke-virtual {v2, v14, v12, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 405
    iget v2, v0, Landroidx/viewpager/widget/PagerTitleStrip;->RatingCompat:I

    sub-int/2addr v14, v2

    sub-int/2addr v14, v1

    invoke-static {v8, v14}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 406
    iget-object v4, v0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    .line 407
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    add-int/2addr v1, v2

    add-int/2addr v7, v5

    .line 406
    invoke-virtual {v4, v2, v5, v1, v7}, Landroid/view/View;->layout(IIII)V

    sub-int/2addr v6, v9

    sub-int v6, v6, p1

    .line 409
    iget v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->RatingCompat:I

    add-int/2addr v3, v1

    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 411
    iget-object v2, v0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    .line 412
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    add-int v4, v1, p1

    add-int/2addr v3, v10

    .line 411
    invoke-virtual {v2, v1, v10, v4, v3}, Landroid/view/View;->layout(IIII)V

    move/from16 v1, p2

    .line 414
    iput v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    const/4 v1, 0x0

    .line 415
    iput-boolean v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method public requestLayout()V
    .registers 2

    .line 308
    iget-boolean v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaDescriptionCompat:Z

    if-nez v0, :cond_7

    .line 309
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_7
    return-void
.end method

.method public setGravity(I)V
    .registers 2

    .line 233
    iput p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 234
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setNonPrimaryAlpha(F)V
    .registers 4

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    and-int/lit16 p1, p1, 0xff

    .line 190
    iput p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaMetadataCompat:I

    shl-int/lit8 p1, p1, 0x18

    .line 191
    iget v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplApi21Parcelizer:I

    const v1, 0xffffff

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    .line 192
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setTextColor(I)V
    .registers 4

    .line 203
    iput p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplApi21Parcelizer:I

    .line 204
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 205
    iget p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->MediaMetadataCompat:I

    shl-int/lit8 p1, p1, 0x18

    iget v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplApi21Parcelizer:I

    const v1, 0xffffff

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    .line 206
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 207
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setTextSize(IF)V
    .registers 4

    .line 221
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 222
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 223
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void
.end method

.method public setTextSpacing(I)V
    .registers 2

    .line 173
    iput p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RatingCompat:I

    .line 174
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method write()I
    .registers 1

    .line 464
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_b

    .line 466
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.viewpager.widget.PagerTitleStrip.AudioAttributesCompatParcelizer (androidx.viewpager.widget.PagerTitleStrip$AudioAttributesCompatParcelizer)
.class final Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;
.super Landroid/database/DataSetObserver;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;
.implements Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/PagerTitleStrip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private RemoteActionCompatParcelizer:I

.field final synthetic write:Landroidx/viewpager/widget/PagerTitleStrip;


# direct methods
.method constructor <init>(Landroidx/viewpager/widget/PagerTitleStrip;)V
    .registers 2

    .line 475
    iput-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(I)V
    .registers 2

    .line 500
    iput p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)V
    .registers 4

    .line 489
    iget p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    if-nez p1, :cond_30

    .line 491
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v0, p1, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result v0

    iget-object v1, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v1, v1, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->read()Lo/getComponentEnabledSetting;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer(ILo/getComponentEnabledSetting;)V

    .line 493
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget p1, p1, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_24

    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget v0, p1, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    .line 494
    :cond_24
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result p1

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Landroidx/viewpager/widget/PagerTitleStrip;->read(IFZ)V

    :cond_30
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/viewpager/widget/ViewPager;Lo/getComponentEnabledSetting;Lo/getComponentEnabledSetting;)V
    .registers 4

    .line 506
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    invoke-virtual {p0, p2, p3}, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer(Lo/getComponentEnabledSetting;Lo/getComponentEnabledSetting;)V

    return-void
.end method

.method public final onChanged()V
    .registers 4

    .line 511
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result v1

    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v2, v2, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->read()Lo/getComponentEnabledSetting;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer(ILo/getComponentEnabledSetting;)V

    .line 513
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget v0, v0, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_20

    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget v1, v0, Landroidx/viewpager/widget/PagerTitleStrip;->read:F

    .line 514
    :cond_20
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result v0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Landroidx/viewpager/widget/PagerTitleStrip;->read(IFZ)V

    return-void
.end method

.method public final read(IF)V
    .registers 4

    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_8

    add-int/lit8 p1, p1, 0x1

    .line 484
    :cond_8
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip$AudioAttributesCompatParcelizer;->write:Landroidx/viewpager/widget/PagerTitleStrip;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/viewpager/widget/PagerTitleStrip;->read(IFZ)V

    return-void
.end method

###### Class androidx.viewpager.widget.PagerTitleStrip.RemoteActionCompatParcelizer (androidx.viewpager.widget.PagerTitleStrip$RemoteActionCompatParcelizer)
.class final Landroidx/viewpager/widget/PagerTitleStrip$RemoteActionCompatParcelizer;
.super Landroid/text/method/SingleLineTransformationMethod;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/PagerTitleStrip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private write:Ljava/util/Locale;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 93
    invoke-direct {p0}, Landroid/text/method/SingleLineTransformationMethod;-><init>()V

    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip$RemoteActionCompatParcelizer;->write:Ljava/util/Locale;

    return-void
.end method


# virtual methods
.method public final getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
    .registers 3

    .line 99
    invoke-super {p0, p1, p2}, Landroid/text/method/SingleLineTransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_11

    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip$RemoteActionCompatParcelizer;->write:Ljava/util/Locale;

    invoke-virtual {p1, p0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_11
    const/4 p0, 0x0

    return-object p0
.end method
